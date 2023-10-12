package _10_Apartamentos;

import javax.swing.*;

public class contas {
    private String nome_despesa;
    private float valor_despesa;
    private int ano_despesa;
    private int mes_despesa;

    public String getNome_despesa() {
        return nome_despesa;
    }

    public void setNome_despesa() {
        String nome_despesa= JOptionPane.showInputDialog(null, "Ensira o nome referente a despesa.");
        if (nome_despesa.isEmpty() || nome_despesa.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome informado é invalido!\nO nome não pode ser vazio");
            setNome_despesa();
        } else {
            this.nome_despesa = nome_despesa;
        }
    }

    public float getValor_despesa() {
        return valor_despesa;
    }

    public void setValor_despesa() {
        try {
            float valor_despesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o valor da despesa."));
            if (valor_despesa < 0) {
                JOptionPane.showMessageDialog(null, "Valor informado é invalido!\nEnsira um valor valido (maior que 0)");
                setValor_despesa();
            } else {
                this.valor_despesa = valor_despesa;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor informado é invalido!");
            setValor_despesa();
        }
    }

    public int getAno_despesa() {
        return ano_despesa;
    }

    public void setAno_despesa() {
        try {
            int ano_despesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o ano referente a despesa."));
            if (ano_despesa > 3000 || ano_despesa < 1900) {
                JOptionPane.showMessageDialog(null, "Ano informado é invalido!\nEnsira um valor valido (de 1900 até 3000)");
                setAno_despesa();
            } else {
                this.ano_despesa = ano_despesa;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ano informado é invalido!");
            setAno_despesa();
        }
    }

    public int getMes_despesa() {
        return mes_despesa;
    }

    public void setMes_despesa() {
        try {
            int mes_despesa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o mês referente a despesa."));
            if (mes_despesa > 12 || mes_despesa < 1) {
                JOptionPane.showMessageDialog(null, "mês informado é invalido!\nEnsira um valor valido (de 1 até 12)");
                setMes_despesa();
            } else {
                this.mes_despesa = mes_despesa;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "mês informado é invalido!");
            setMes_despesa();
        }
    }

    public void cadastrar() {
        setNome_despesa();
        setAno_despesa();
        setMes_despesa();
        setValor_despesa();
        JOptionPane.showMessageDialog(null, "Cadastro de despesa "+getNome_despesa()+" concluido!");
    }
}
