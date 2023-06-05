class MyComponent extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: "open" });

    //base do component
    const componentRoot = document.createElement("h1");
    componentRoot.textContent = "Reginaldo";

    //estilo do component
    const style = document.createElement("style");
    style.textContent = `
      h1{
        color: red
      }
    `;

    //envia para shadow
    shadow.appendChild(componentRoot);
    shadow.appendChild(style);
  }
}

customElements.define("meu-componente", MyComponent);
