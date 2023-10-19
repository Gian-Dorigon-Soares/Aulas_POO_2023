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
    @Override
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
            float LM = Float.parseFloat(JOptionPane.showInputDialog(null, "Ensira um limite transações"));
            if (LM <= 0) {
                JOptionPane.showMessageDialog(null, "Limite inserido é invalido!\nEnsira um limite maior que R$ 0");
                cadastrarConta(contasCadastradas);
            }
            setNumero(contasCadastradas.size()+1);
            JOptionPane.showMessageDialog(null, "A conta "+getNumero()+" - "+getNome()+ "foi criada com sucesso");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Valor inserido é invalido");
            cadastrarConta(contasCadastradas);
        }
    }

    @Override
    public void saque() {
        try {
            double ValorSaque = Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira o valor a sacar"));
            if (ValorSaque <= 0 || ValorSaque > getLimite()) {
                JOptionPane.showMessageDialog(null, "Valor de saque invalido!");
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
            if (ValorTransferencia <= 0 || ValorTransferencia > getLimite()) {
                JOptionPane.showMessageDialog(null, "Valor de transferencia invalido!");
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
