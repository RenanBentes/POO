class Produto {
    constructor(nome, preco) {
        this.nome = nome;
        this.preco = preco;
    }

    exibir() {
        console.log(`Produto: ${this.nome}, Preço: ${this.preco}`);
    }
}

module.exports = Produto;
