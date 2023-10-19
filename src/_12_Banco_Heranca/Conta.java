package _12_Banco_Heranca;

import javax.swing.*;
import java.util.ArrayList;

public class Conta {
    private int Numero;
    private int Agencia;
    private String Nome;
    private double Saldo;

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

    public void cadastrarConta(ArrayList<Conta> contasCadastradas) {
        try{
        String NM = JOptionPane.showInputDialog(null, "Ensira o nome do proprietario da conta");
        if (NM.isEmpty() || NM.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome cadastrado não pode ser vazio!");
            cadastrarConta(contasCadastradas);
        } else {
            setNome(NM);
        }
        int AG = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o numero da agencia"));
        if (AG <= 0) {
        JOptionPane.showMessageDialog(null, "Ensira um numero de agencia valido!");
        cadastrarConta(contasCadastradas);
        } else {
            setAgencia(AG);
        }
        setNumero(contasCadastradas.size()+1);
        JOptionPane.showMessageDialog(null, "A conta "+getNumero()+" - "+getNome()+ "foi criada com sucesso");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor inserido é invalido");
            cadastrarConta(contasCadastradas);
        }
    }

    public void deposito() {
        try {
            double ValorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a depositar"));
            if (ValorDeposito <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de deposito invalido!\n" +
                        "Ensira um valor maior do que R$ 0");
                deposito();
            } else {
                setSaldo(ValorDeposito);
                JOptionPane.showMessageDialog(null, "Deposito de R$ "+ValorDeposito+" realizado com sucesso!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de deposito invalido!");
            deposito();
        }
    }
    public void saque() {
        try {
        double ValorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a sacar"));
        if (ValorSaque <= 0) {
            JOptionPane.showMessageDialog(null, "Valor de saque invalido!\n" +
                    "Ensira um valor maior do que R$ 0");
            saque();
        } else {
            setSaldo(getSaldo()-ValorSaque);
            JOptionPane.showMessageDialog(null, "Saque de R$ "+ValorSaque+" realizado com sucesso!");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Valor de saque invalido!");
        saque();
    }
    }
    public void transferencia (final Conta ContaParaTranferir) {
        try {
            double ValorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a transferir para "+
                    ContaParaTranferir.getNumero()+" - "+ContaParaTranferir.getNome()));
            if (ValorTransferencia <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de transferencia invalido!\n" +
                        "Ensira um valor maior do que R$ 0");
                transferencia(ContaParaTranferir);
            } else if (ContaParaTranferir instanceof Conta_Universitaria && ValorTransferencia+ContaParaTranferir.getSaldo() > 2000){
                JOptionPane.showMessageDialog(null, "Limite de saldo da conta a transferir foi exedido!\nTente um valor menor");
                transferencia(ContaParaTranferir);
            } else {
                setSaldo(getSaldo()-ValorTransferencia);
                ContaParaTranferir.setSaldo(ValorTransferencia);
                JOptionPane.showMessageDialog(null, "Transferencia de R$ "+ValorTransferencia+" para "+ContaParaTranferir.getNumero()+ " - "+ContaParaTranferir.getNome()+" realizada com sucesso!");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor de transferencia invalido!");
            transferencia(ContaParaTranferir);
        }
    }
}
