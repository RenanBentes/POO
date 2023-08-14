public class Main {
    public static void main(String[] args) {
            Produto produto1 = new Produto("Notebook", 3000);
            Empresa empresa1 = new Empresa("TechCom", "Joinville");

            produto1.exibir();
            empresa1.exibir();
    }
}
