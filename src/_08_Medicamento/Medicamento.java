package _08_Medicamento;

import javax.swing.*;
import java.util.ArrayList;

public class Medicamento {
    private String nome;
    private String adiministracao;
    ArrayList<String> indicações = new ArrayList<>();
    ArrayList<String> contraindicações = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAdiministracao() {
        return adiministracao;
    }

    public void setAdiministracao(String adiministracao) {
        this.adiministracao = adiministracao;
    }

    public ArrayList<String> getIndicações() {
        return indicações;
    }

    public void setIndicações(ArrayList<String> indicações) {
        this.indicações = indicações;
    }

    public ArrayList<String> getContraindicações() {
        return contraindicações;
    }

    public void setContraindicações(ArrayList<String> contraindicações) {
        this.contraindicações = contraindicações;
    }

    public void cadastrar() {
        String NM = JOptionPane.showInputDialog(null, "Ensira o nome do medicamento:");
        if (NM.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ensira um nome valido");
            cadastrar();
        } else {
            setNome(NM);
        }
        String AD = JOptionPane.showInputDialog(null, "Informe o modo de administração:\n" +
                "Oral\nInjetavel\nTópico");
        if (    AD.equalsIgnoreCase("Oral")||
                AD.equalsIgnoreCase("Injetavel")||
                AD.equalsIgnoreCase("Tópico") ||
                AD.equalsIgnoreCase("Injetável")||
                AD.equalsIgnoreCase("Topico"))
        {
            setAdiministracao(AD);
        } else {
            JOptionPane.showMessageDialog(null, "Ensira uma administração valida valido");
            cadastrar();
        }
        String IND;
        String loop = "N";
        do {
            IND = JOptionPane.showInputDialog(null, "Ensira uma indicação do medicamento:");
            if (IND.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ensira um nome valido");
                cadastrar();
            } else {
                indicações.add(IND);
                IND = "";
                loop = JOptionPane.showInputDialog(null, "Adicionar mais alguma indicação? S/N");
                loop = String.valueOf(loop.charAt(0));
            }
        } while (loop=="S");
        loop = "N";
        String CIND;
        do {
            CIND = JOptionPane.showInputDialog(null, "Ensira uma contra indicação do medicamento:");
            if (CIND.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ensira um nome valido");
                cadastrar();
            } else {
               getContraindicações().add(CIND);
                CIND = "";
                loop = JOptionPane.showInputDialog(null, "Adicionar mais alguma contra indicação? S/N");
                loop = String.valueOf(loop.charAt(0));
            }
        } while (loop=="S");
        JOptionPane.showMessageDialog(null, "Cadastro finalizado com sucesso!");
    }
}
