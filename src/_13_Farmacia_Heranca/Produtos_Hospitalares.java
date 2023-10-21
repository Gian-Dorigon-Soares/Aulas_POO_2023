package _13_Farmacia_Heranca;

public class Produtos_Hospitalares extends Produto {
    public Produtos_Hospitalares() {
        super("",0,0);
    }

    public Produtos_Hospitalares(String nome, int estoque, float valor) {
        super(nome, estoque, valor);
    }

    public boolean vender (Cliente comprador,final int quantidade) {
        setEstoque(getEstoque()-quantidade);
        comprador.setDivida(getValor()*quantidade);
        return true;
    }
}
