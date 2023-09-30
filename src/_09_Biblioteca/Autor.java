package _09_Biblioteca;

import javax.swing.*;
import java.util.ArrayList;
import java.util.jar.JarEntry;

public class Autor {
    private String Nome;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void cadastarAutor() {
        String NM;
        NM = JOptionPane.showInputDialog(null, "Ensira o nome do autor:");
        if (NM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ensira um nome valido!");
            cadastarAutor();
        }
        JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso!");
    }
}
