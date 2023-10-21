package _12_Banco_Heranca;

import javax.swing.*;

public class Conta_Universitaria extends Conta {
    public Conta_Universitaria(int numero, int agencia, String nome, double saldo) {
        super(numero, agencia, nome, saldo);
    }

    public Conta_Universitaria() {
    }

    @Override
    public boolean deposito(double ValorDeposito) {
        try {
            if (ValorDeposito <= 0) {
                return false;
            } else if(ValorDeposito+getSaldo() > 2000) {
                        return false;
            } else {
                setSaldo(getSaldo()+ValorDeposito);
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public boolean saque(double ValorSaque) {
        try {
            if (ValorSaque <= 0) {
                return false;
            } else if (getSaldo() < ValorSaque) {
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
