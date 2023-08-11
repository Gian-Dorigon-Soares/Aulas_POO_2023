package _01_classes_objetos;

import javax.swing.*;

public class Pessoa {
    String nome;
    float peso;
    float altura;
    char sexo;

    void Cadastro() {
        nome = JOptionPane.showInputDialog(null, "Ensira o nome dessa pessoa");
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Ensira o peso do(a) "+nome));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ensira a altura do(a) "+nome));
        sexo = JOptionPane.showInputDialog(null, "Ensira o sexo do(a) "+nome).toUpperCase().charAt(0);
    }

    float calcularIMC() {
        return peso/(altura*altura);
    }

    String Avaliacao() {
        String avaliacao = "";
        float imc = calcularIMC();
        if (sexo =='M') {
            if (imc < 20.7) {
                avaliacao = "Abaixo do peso";
            } else if (imc >= 20.7 && imc < 26.4) {
                avaliacao = "Peso ideal";
            } else if (imc >= 26.5 && imc < 27.8) {
                avaliacao = "Pouco acima do peso";
            } else if (imc >= 27.9 && imc < 31.1) {
                avaliacao = "Acima do peso";
            } else {
                avaliacao = "Obesidade";
            }
        } else if (sexo == 'F') {
            if (imc < 19.1) {
                avaliacao = "Abaixo do peso";
            } else if (imc >= 19.1 && imc < 25.8) {
                avaliacao = "Peso ideal";
            } else if (imc >= 25.9 && imc < 27.3) {
                avaliacao = "Pouco acima do peso";
            } else if (imc >= 27.4 && imc < 32.3) {
                avaliacao = "Acima do peso";
            } else {
                avaliacao = "Obesidade";
            }
        }


        return avaliacao;
    }

    String Exibirdados() {
        return nome + " - " + calcularIMC() + " - " + Avaliacao()+"\n";
    }

}
