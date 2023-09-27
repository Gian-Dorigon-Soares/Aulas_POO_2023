package _07_Diciplinas;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {

    private String nome;
    private ArrayList<Diciplinas> discMatriculadas = new ArrayList<Diciplinas>();
    private ArrayList<Notas> notas = new ArrayList<Notas>();

    public void cadastra() {
        setNome(JOptionPane.showInputDialog("Nome do aluno"));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Diciplinas> getDiscMatriculadas() {
        return discMatriculadas;
    }
    public void setDiscMatriculadas(ArrayList<Diciplinas> discMatriculadas) {
        this.discMatriculadas = discMatriculadas;
    }

    public ArrayList<Notas> getNotas() {
        return notas;
    }

    public String exibeNotas() {
        String retorno = "";
        for (Notas n: this.notas) {
            retorno += n.exibir();
        }
        return retorno;
    }

    public void setNotas(ArrayList<Notas> notas) {
        this.notas = notas;
    }




}
