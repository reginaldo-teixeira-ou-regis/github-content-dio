package dev.rt.credit.application.system.controller

import jakarta.validation.Valid
import dev.rt.credit.application.system.dto.request.CustomerDto
import dev.rt.credit.application.system.dto.request.CustomerUpdateDto
import dev.rt.credit.application.system.dto.response.CustomerView
import dev.rt.credit.application.system.entity.Customer
import dev.rt.credit.application.system.service.impl.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/customers")
class CustomerResource(
  private val customerService: CustomerService
) {

  @PostMapping
  fun saveCustomer(@RequestBody @Valid customerDto: CustomerDto): ResponseEntity<CustomerView> {
    val savedCustomer: Customer = this.customerService.save(customerDto.toEntity())
    return ResponseEntity.status(HttpStatus.CREATED).body(CustomerView(savedCustomer))
  }

  @GetMapping("/{id}")
  fun findById(@PathVariable id: Long): ResponseEntity<CustomerView> {
    val customer: Customer = this.customerService.findById(id)
    return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customer))
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  fun deleteCustomer(@PathVariable id: Long) = this.customerService.delete(id)

  @PatchMapping
  fun upadateCustomer(
    @RequestParam(value = "customerId") id: Long,
    @RequestBody @Valid customerUpdateDto: CustomerUpdateDto
  ): ResponseEntity<CustomerView> {
    val customer: Customer = this.customerService.findById(id)
    val cutomerToUpdate: Customer = customerUpdateDto.toEntity(customer)
    val customerUpdated: Customer = this.customerService.save(cutomerToUpdate)
    return ResponseEntity.status(HttpStatus.OK).body(CustomerView(customerUpdated))
  }
}