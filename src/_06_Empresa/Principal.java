package _06_Empresa;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList <Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario.setIdadeMinima();
        String menu = "Selecione uma opção\n\n" +
                "1 - Exibir idade minima para contratação\n" +
                "2 - Editar idade minima para contratação\n" +
                "3 - Exibir quantidade de funcionarios contratados\n" +
                "4 - Contratar Novo Funcionario\n" +
                "5 - Sair";
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        do {
            switch (op) {
                case 1:
                    if (Funcionario.getIdadeMinima() > 0) {
                        JOptionPane.showMessageDialog(null, "Idade minima para contratação: " + Funcionario.getIdadeMinima() + " anos");
                    } else {
                        JOptionPane.showMessageDialog(null, "Idade minima não cadastrada!");
                    }
                    op = 0;
                    break;
                case 2:
                    Funcionario.setIdadeMinima();
                    op = 0;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quantidade de funcionarios cadastrados: "+Funcionario.getTotalFuncionario()+" funcionarios");
                    op = 0;
                    break;
                case 4:
                    if (Principal.contratar(funcionarios)) {
                        JOptionPane.showMessageDialog(null, "sucesso ao cadastrar!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Falha ao cadastrar!");
                    }
                    op = 0;
                    break;
                default:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                    break;
            }
        }while (op != 5);
    }

    public static boolean contratar (ArrayList Funcionarios) {
        Funcionario func = new Funcionario();
        func.setNome(JOptionPane.showInputDialog(null, "Ensira o nome do Funcionario"));
        for (Funcionario fun: (ArrayList<Funcionario>) Funcionarios) {
            if (func.getNome().equals(fun.getNome())) {
                JOptionPane.showMessageDialog(null, "Já a um funcionario com o nome "+func.getNome()+"!");
                return false;
            }
        }
        func.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira a idade do funcionario")));
        if (func.getIdade() < Funcionario.getIdadeMinima()) {
            return false;
        } else {
            Funcionarios.add(func);
            Funcionario.setTotalFuncionario(Funcionario.getTotalFuncionario()+1);
            return true;
        }
    }
}
