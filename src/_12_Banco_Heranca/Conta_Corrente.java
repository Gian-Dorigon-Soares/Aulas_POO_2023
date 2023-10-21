package _12_Banco_Heranca;

import javax.swing.*;

public class Conta_Corrente extends Conta{
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
