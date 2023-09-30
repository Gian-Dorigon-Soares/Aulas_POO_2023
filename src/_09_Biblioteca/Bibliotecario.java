package _09_Biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Bibliotecario {
    private String nome;
    private ArrayList<Livro> livrosAtribuidos = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Livro> getLivrosAtribuidos() {
        return livrosAtribuidos;
    }

    public void setLivrosAtribuidos(ArrayList<Livro> livrosAtribuidos) {
        this.livrosAtribuidos = livrosAtribuidos;
    }

    public void cadastarBibliotecario(ArrayList<Livro> livrosCadastrados) {
        String NM;
        NM = JOptionPane.showInputDialog(nome, "Ensira o nome do bibliotecario");
        if (NM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome inserido é invalido");
            cadastarBibliotecario(livrosCadastrados);
        }
        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
    }
    public void cadastraLivro (String titulo,Autor autor) {
        if(titulo.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar o livro");
            return;
        } else {
            Livro l = new Livro();
            l.setTitulo(titulo);
            l.setAutor(autor);
            livrosAtribuidos.add(l);
            JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");
        }
    }
}
