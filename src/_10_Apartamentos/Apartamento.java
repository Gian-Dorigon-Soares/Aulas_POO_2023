package _10_Apartamentos;

import javax.swing.*;

public class Apartamento {
    int Numero;
    int Bloco;
    float Metragem;
    String Proprietario;

    public int getNumero() {
        return Numero;
    }

    public void setNumero() {
        try{
            int NR = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o numero do apartamento"));
            if (NR <= 0) {
                JOptionPane.showMessageDialog(null, "Numero invalido!\nO numero deve ser maior que 0");
                setNumero();
            } else {
                this.Numero = NR;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Numero invalido!");
            setNumero();
        }
    }

    public int getBloco() {
        return Bloco;
    }

    public void setBloco() {
        try{
            int BL = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o numero do bloco do apartamento"));
            if (BL <= 0) {
                JOptionPane.showMessageDialog(null, "Bloco invalido!\nO bloco deve ser maior que 0");
                setBloco();
            } else {
                this.Bloco = BL;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Bloco invalido!");
            setBloco();
        }
    }

    public float getMetragem() {
        return Metragem;
    }

    public void setMetragem() {
        try {
            float MT = Float.parseFloat(JOptionPane.showInputDialog(null, "Ensira o tamanho (em Mt²) do apartamento"));
            if (MT <= 0) {
                JOptionPane.showMessageDialog(null, "Metragem invalida!\nA metragem deve ser maior que 0 Mt²");
                setMetragem();
            } else {
                this.Metragem = MT;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Metragem invalida!");
            setMetragem();
        }
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario() {
        String NM = JOptionPane.showInputDialog(null, "Ensira o nome do proprietario");
        if (NM.isEmpty() || NM.isBlank()) {
            JOptionPane.showMessageDialog(null, "Nome inserido invalido");
            setProprietario();
        } else {
            this.Proprietario = NM;
        }
    }

    public void cadastrar() {
        setNumero();
        setBloco();
        setMetragem();
        setProprietario();
        JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso");
    }
}
