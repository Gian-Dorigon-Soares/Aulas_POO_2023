package _13_Farmacia_Heranca;

public class Produto {
    protected String Nome;
    protected int Estoque;
    protected float Valor;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getEstoque() {
        return Estoque;
    }

    public void setEstoque(int estoque) {
        Estoque = estoque;
    }

    public float getValor() {
        return Valor;
    }

    public void setValor(float valor) {
        Valor = valor;
    }

    public Produto() {
        Nome = "";
        Estoque = 0;
        Valor = 0;
    }

    public Produto(String nome, int estoque, float valor) {
        Nome = nome;
        Estoque = estoque;
        Valor = valor;
    }
    @Override
    public String toString () {
        return getNome() + " - Estoque: " + getEstoque()+ " - Valor de venda:R$ " +getValor()+"\n";
    }

    public boolean processarVenda (Cliente comprador,final int quantidade) {
        setEstoque(getEstoque()-quantidade);
        comprador.setDivida(getValor()*quantidade);
        return true;
    }
}
