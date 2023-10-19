package _12_Banco_Heranca;

import javax.swing.*;

public class Conta_Universitaria extends Conta {

    @Override
    public void deposito() {
        try {
            double ValorDeposito = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a depositar"));
            if (ValorDeposito <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de deposito invalido!\n" +
                        "Ensira um valor maior do que R$ 0");
                deposito();
            } else if(ValorDeposito+getSaldo() > 2000) {
                JOptionPane.showMessageDialog(null, "Saldo da conta irá ultrapassar o valor de limite!\n" +
                        "Tente novamente com um valor menor");
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
    @Override
    public void saque() {
        try {
            double ValorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a sacar"));
            if (ValorSaque <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de saque invalido!\n" +
                        "Ensira um valor maior do que R$ 0");
                saque();
            } else if (getSaldo() < ValorSaque) {
                JOptionPane.showMessageDialog(null, "Valor de saque é superior ao saldo disponivel!\nTente novamento com um valor menor");
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
    @Override
    public void transferencia (final Conta ContaParaTranferir) {
        try {
            double ValorTransferencia = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a transferir para "+
                    ContaParaTranferir.getNumero()+" - "+ContaParaTranferir.getNome()));
            if (ValorTransferencia <= 0) {
                JOptionPane.showMessageDialog(null, "Valor de transferencia invalido!\n" +
                        "Ensira um valor maior do que R$ 0");
                transferencia(ContaParaTranferir);
            }else if (getSaldo() < ValorTransferencia) {
                JOptionPane.showMessageDialog(null, "Valor de transferencia é superior ao saldo disponivel!\nTente novamento com um valor menor");
                saque();
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
