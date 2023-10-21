package _13_Farmacia_Heranca;

public class Cliente {
    private String Nome;
    private float Divida;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getDivida() {
        return Divida;
    }

    public void setDivida(float divida) {
        Divida = divida;
    }

    public Cliente(String nome, float divida) {
        Nome = nome;
        Divida = divida;
    }

    public Cliente() {
        Nome = "";
        Divida = 0;
    }

    @Override
    public String toString () {
        return getNome() + " - Divida: R$"+ getDivida()+"\n";
    }

    public boolean Pagar (float valor) {
        if (valor > getDivida()) {
            System.out.println("Troco de R$"+(valor-getDivida()));
            setDivida(0);
            return true;
        }
        setDivida(getDivida()-valor);
        return true;
    }
}
