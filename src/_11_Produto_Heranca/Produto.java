package _11_Produto_Heranca;

public class Produto {
    protected String nome;
    protected float preco;

    Produto() {
        System.out.println("Produto criado");
    }


    public boolean ehCaro () {
        return preco > 100;
    }
}
