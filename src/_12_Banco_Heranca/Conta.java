package _12_Banco_Heranca;

import javax.swing.*;
import java.util.ArrayList;

public class Conta {
    private int Numero;
    private int Agencia;
    private String Nome;
    private double Saldo;

    public Conta(int numero, int agencia, String nome, double saldo) {
        Numero = numero;
        Agencia = agencia;
        Nome = nome;
        Saldo = saldo;
    }

    public Conta() {
        this(0,0, "", 0);
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getAgencia() {
        return Agencia;
    }

    public void setAgencia(int agencia) {
        Agencia = agencia;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getSaldo() {
        return Saldo;
    }

    protected void setSaldo(double saldo) {
        Saldo = saldo;
    }

    @Override
    public String toString () {
        return getNumero()+" - "+getNome()+" - R$ "+getSaldo()+"\n";
    }

    public boolean deposito(double ValorDeposito) {
        try {
            if (ValorDeposito <= 0) {
                return false;
            } else {
                setSaldo(getSaldo()+ValorDeposito);
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean saque(double ValorSaque) {
        try {
        if (ValorSaque <= 0) {
            return false;
        } else if (ValorSaque <= getSaldo()){
            setSaldo(getSaldo()-ValorSaque);
            return true;
        } else {
            return false;
        }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean transferencia (Conta ContaParaTranferir, double ValorTransferencia) {
        if (saque(ValorTransferencia)) {
            if (ContaParaTranferir.deposito(ValorTransferencia)) {
                return true;
            }
            deposito(ValorTransferencia);
            return false;
        }
        return false;
    }
}
