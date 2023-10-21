package _13_Farmacia_Heranca;

public class Perfumaria extends Produto {
    public Perfumaria() {
        super("",0,0);
    }

    public Perfumaria(String nome, int estoque, float valor) {
        super(nome, estoque, valor);
    }

    public boolean vender (Cliente comprador,final int quantidade) {
        if (comprador.getDivida() >= 100f ) {
            return false;
        }
        if (getEstoque() < quantidade) {
            return false;
        }
        return processarVenda(comprador,quantidade);
    }
}
