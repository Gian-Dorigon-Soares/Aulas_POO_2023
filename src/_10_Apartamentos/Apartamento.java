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

    public void setNumero(int numero) {
        Numero = numero;
    }

    public int getBloco() {
        return Bloco;
    }

    public void setBloco(int bloco) {
        Bloco = bloco;
    }

    public float getMetragem() {
        return Metragem;
    }

    public void setMetragem(float metragem) {
        Metragem = metragem;
    }

    public String getProprietario() {
        return Proprietario;
    }

    public void setProprietario(String proprietario) {
        Proprietario = proprietario;
    }

    public void cadastrar() {
        int NR = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero do apartamento"));
        setNumero(NR);
        int BL = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira o numero do bloco do apartamento"));
        setBloco(BL);
        float MT = Float.parseFloat(JOptionPane.showInputDialog(null, "Ensira o tamanho (em Mt²) do apartamento"));
        setMetragem(MT);
        String NM = JOptionPane.showInputDialog(null, "Ensira o nome do proprietario");
        if (NM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inserido invalido");
            cadastrar();
        } else {
            setProprietario(NM);
        }
        JOptionPane.showMessageDialog(null, "Apartamento cadastrado com sucesso");
    }
}
