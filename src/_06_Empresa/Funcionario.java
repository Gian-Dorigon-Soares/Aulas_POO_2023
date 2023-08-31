package _06_Empresa;

import javax.swing.*;
public class Funcionario {
    //-----Dados estaticos dos funcionarios e metodos getter & setter
    private static int totalFuncionario;
    private static int idadeMinima;

    public static int getTotalFuncionario() {
        return totalFuncionario;
    }

    public static void setTotalFuncionario(int totalFuncionario) {
        Funcionario.totalFuncionario = totalFuncionario;
    }

    public static int getIdadeMinima() {
        return idadeMinima;
    }

    public static void setIdadeMinima() {
      boolean loop = true;
        do {
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira a idade minima para contratação"));
            if (idade > 0) {
               Funcionario.idadeMinima = idade;
               loop = false;
           } else {
               JOptionPane.showMessageDialog(null, "não é possivel cadastrar essa idade minima");
           }
       } while (loop);
    }
    //-----Dados e metodos de cada objeto funcionario
    private int idade;
    private String nome;

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if (idade >= getIdadeMinima()) {
            this.idade = idade;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Idade abaixo da idade minima permitida!");
            return false;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toLowerCase();
    }
}
