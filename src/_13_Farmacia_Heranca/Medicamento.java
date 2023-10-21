package _13_Farmacia_Heranca;

public class Medicamento extends Produto{
    private boolean RequerReceita;

    public boolean isRequerReceita() {
        return RequerReceita;
    }

    public void setRequerReceita(boolean requerReceita) {
        RequerReceita = requerReceita;
    }

    public Medicamento() {
        super("",0,0);
        RequerReceita = false;
    }
    public Medicamento(String nome, int estoque, float valor, boolean requerReceita) {
        super(nome, estoque, valor);
        RequerReceita = requerReceita;
    }

    @Override
    public String toString () {
        if (RequerReceita) {
            return getNome() + " - Estoque: " + getEstoque() + " - Valor de venda:R$ " + getValor() + " - Medicamento controlado\n";
        }
        return  super.toString();
    }

    public boolean vender(Cliente comprador,final int quantidade,final String Medico) {
        if (RequerReceita) {
            if (Medico.isBlank()) {
                return false;
            }
            if (getEstoque() < quantidade) {
                return false;
            }
            return processarVenda(comprador, quantidade);
        }
        if (getEstoque() < quantidade) {
            return false;
        }
        return processarVenda(comprador, quantidade);
    }
}
