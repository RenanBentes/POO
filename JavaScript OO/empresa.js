class Empresa {
    constructor(nome, localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    exibir() {
        console.log(`Empresa: ${this.nome}, Localização: ${this.localizacao}`);
    }
}

module.exports = Empresa;
