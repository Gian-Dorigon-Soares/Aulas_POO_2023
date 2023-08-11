package _01_classes_objetos;

import javax.swing.*;

public class Principal_IMC_1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Quantas pessoas serão cadastradas?"));

        Pessoa pessoas[] = new Pessoa[n];

        String resultado = "";

        for(int i = 0; i < n; i++) {
            Pessoa p = new Pessoa();
            p.Cadastro();
            pessoas[i] = p;
            resultado += p.Exibirdados();
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
