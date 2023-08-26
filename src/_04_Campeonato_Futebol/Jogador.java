package _04_Campeonato_Futebol;

import javax.swing.*;

public class Jogador {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCamisa() {
        return camisa;
    }

    public void setCamisa(int camisa) {
        this.camisa = camisa;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    private int camisa;
    private int gols;

    void Cadastrar() {
        setNome(JOptionPane.showInputDialog(null, "Nome:"));
        setCamisa(Integer.parseInt(JOptionPane.showInputDialog(null, "Nº Camisa")));
        setGols(Integer.parseInt(JOptionPane.showInputDialog(null, "Qtd. Gols")));
    }

    String Exibir() {
        return getNome() + " | Camisa " + getCamisa() + " | Gols: " + getGols() + "\n";
    }
}
