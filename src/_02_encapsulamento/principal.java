package _02_encapsulamento;

import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João");
        p.setIdade(10);
        if (p.getNome() != null && p.getIdade() != 0) {
            String dados = p.getNome() + " | " + p.getIdade();
            JOptionPane.showMessageDialog(null, dados);
        }
    }
}
