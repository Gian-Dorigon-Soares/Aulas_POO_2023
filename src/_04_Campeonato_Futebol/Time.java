package _04_Campeonato_Futebol;

import javax.swing.*;
import java.util.ArrayList;

public class Time {
    private String nome;
    private ArrayList <Jogador> jogadores = new ArrayList<Jogador>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void Cadastrar() {
        setNome(JOptionPane.showInputDialog(null, "Nome do Time"));
        String continua = "";
        do {
            Jogador j = new Jogador();
            j.Cadastrar();
            jogadores.add(j);
            continua = JOptionPane.showInputDialog("Mais jogadores? S/N");
        } while (continua.equalsIgnoreCase("S"));
    }

    String Exibir() {
        String dados = "-------|| "+getNome().toUpperCase()+" ||-------\n";
        for(Jogador j: jogadores) {
            dados += j.Exibir();
        }
        return dados;
    }

    public Jogador ArtilheiroTime() {
        Jogador art = jogadores.get(0);
        for(Jogador j : jogadores) {
            if(j.getGols() > art.getGols()) {
                art = j;
            }
        }
        return art;
    }

    public int GetGolsTime() {
        int gols = 0;
        for(Jogador j: jogadores) {
            gols += j.getGols();
        }
        return gols;
    }
}
