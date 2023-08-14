public class Empresa {
    private String nome;
    private String localizacao;

    public Empresa(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public void exibir() {
        System.out.println("Empresa: " + nome + ", Localização: " + localizacao);
    }
}
