package _01_classes_objetos;

import javax.swing.*;
import java.util.ArrayList;

public class Principal_IMC_2 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        String menu = "1 - Cadastrar\n2 - Listar\n3 - Sair";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            if (op == 1) {
                Pessoa p = new Pessoa();
                p.Cadastro();
                pessoas.add(p);
            } else if (op == 2) {
                String resultado = "Pessoas cadastradas\n\n";
                for(Pessoa p: pessoas) {
                    resultado += p.Exibirdados();
                }
                JOptionPane.showMessageDialog(null, resultado);
            }
        } while (op != 3);
    }
}
