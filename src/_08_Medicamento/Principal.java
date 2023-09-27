package _08_Medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        ArrayList<Medicamento> medicamentos = new ArrayList<>();

        String menu = "Selecione uma opção\n" +
            "_______________________________________\n"+
            "1 - Cadastrar Medicamento\n" +
            "2 - Cadastrar Paciente\n" +
            "3 - Prescrever medicamento para paciente\n" +
            "4 - Listar pacientes\n" +
            "_______________________________________\n" +
            "0 - Finaliazar";
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            switch (op) {
                case 1:
                Medicamento m = new Medicamento();
                m.cadastrar();
                medicamentos.add(m);
            }
        } while (op != 0);
    }
}
