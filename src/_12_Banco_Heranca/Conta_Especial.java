package _12_Banco_Heranca;

import javax.swing.*;
import java.util.ArrayList;

public class Conta_Especial extends Conta{
    Float Limite;

    public Float getLimite() {
        return Limite;
    }

    public void setLimite(Float limite) {
        Limite = limite;
    }
    public Conta_Especial() {
        super();
        setLimite(0f);
    }
    public Conta_Especial(int numero, int agencia, String nome, double saldo,float limite){
            super(numero, agencia, nome, saldo);
            setLimite(limite);
    }

    @Override
    public boolean saque(double ValorSaque) {
        try {
            if (ValorSaque <= 0 || ValorSaque > getLimite()) {
                return false;
            } else if (getSaldo()+getLimite() < ValorSaque) {
                return false;
            } else {
                setSaldo(getSaldo()-ValorSaque);
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
