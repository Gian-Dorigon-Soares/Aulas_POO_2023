package _09_Biblioteca;

import javax.swing.*;
import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;

    private Bibliotecario bibliotecario;

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void cadastrarLivro(ArrayList<Autor> AutoresCadastrados) {
        String TI;
        TI =JOptionPane.showInputDialog(null, "Ensira o titulo do livro");
        if (TI.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ensira um titulo valido");
        }
        String autores="";
        int cont = 1;
        for (Autor a:AutoresCadastrados) {
            autores += cont+ " - "+ a.getNome() +"\n";
            cont ++;
        }
        int op = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha um autor cadastrado:\n"
                +autores+
                "______\n" +
                "0 - Cadastrar novo autor"));
        if (op==0) {
            Autor a = new Autor();
            a.cadastarAutor();
            setAutor(a);
        } else if (op <= AutoresCadastrados.size()){
            Autor a = AutoresCadastrados.get(op-1);
            setAutor(a);
        } else {
            JOptionPane.showMessageDialog(null, "Autor invalido");
            cadastrarLivro(AutoresCadastrados);
        }
        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
    }
}
