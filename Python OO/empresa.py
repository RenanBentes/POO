class Empresa:
    def __init__(self, nome, localizacao):
        self.nome = nome
        self.localizacao = localizacao

    def exibir(self):
        print(f"Empresa: {self.nome}, Localização: {self.localizacao}")