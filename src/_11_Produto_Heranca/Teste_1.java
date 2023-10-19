package _11_Produto_Heranca;

public class Teste_1 {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.nome = "a";
        l.preco = 150;
        l.pgs = 199;
        System.out.println(l.ehCaro());
        System.out.println(l.ehGrande());

    }
}
