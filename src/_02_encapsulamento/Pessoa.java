package _02_encapsulamento;

import javax.swing.*;

public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar o nome");
        } else {
            this.nome = nome.toUpperCase();
        }
    }

    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar a idade");
        }
    }
}
