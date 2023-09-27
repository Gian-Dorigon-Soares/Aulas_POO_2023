package _07_Diciplinas;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
        private static ArrayList<Professor> professores = new ArrayList<Professor>();
        private static ArrayList<Diciplinas> disciplinas = new ArrayList<Diciplinas>();
        private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        public static void main(String[] args) {
            int op = 0;
            do {
                op = menu();
                switch (op) {
                    case 1:
                        professores.add(new Professor());
                        break;
                    case 2:
                        Diciplinas d = new Diciplinas();
                        d.cadastrar(professores);
                        disciplinas.add(d);
                        break;
                    case 3:
                        Aluno a = new Aluno();
                        a.cadastra();
                        alunos.add(a);
                        break;
                    case 4:
                        matricula();
                        break;
                    case 5:
                        informarNotas();
                        break;
                    case 6:
                        exibirNotasAluno();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, exibeformação());
                }
            }while(op != 10);
        }

        public static int menu() {
            String menu = "1 - Cadastrar Professores\n"
                    + "2 - Cadastrar Disciplinas\n"
                    + "3 - Cadastrar Alunos\n"
                    + "4 - Matricular\n" +
                    "5 - Inserir notas\n" +
                    "6 - Exibir notas do aluno\n"+
                    "7 - Exibir diciplinas com professores pós graduados\n"
                    + "10 - Sair";
            return Integer.parseInt(JOptionPane.showInputDialog(menu));
        }

        public static void matricula() {
            Aluno a = Util.selecionaAluno(alunos);
            Diciplinas d = Util.selcionaDiciplina(disciplinas);
            JOptionPane.showMessageDialog(null, "Diciplinas de "+a.getNome()+"\n" +
                    d.exibirDados());
        }
        public static void informarNotas() {
            Aluno a = Util.selecionaAluno(alunos);
            Diciplinas d = Util.selcionaDiciplina(disciplinas);
            Notas n =  new Notas();
            n.setDisc(d);
            n.setN1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira a primeira nota:")));
            n.setN2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira a segunda nota:")));
            n.setN3(Double.parseDouble(JOptionPane.showInputDialog(null, "Ensira a terceira nota:")));
            a.getNotas().add(n);
            JOptionPane.showMessageDialog(null, "Notas cadastradas!");
        }
        public static void exibirNotasAluno() {
            Aluno a = Util.selecionaAluno(alunos);
            JOptionPane.showMessageDialog(null, a.exibeNotas());
        }
    public static String exibeformação() {
        String retorno = "";
        for (Diciplinas d: disciplinas) {
            if (d.getProfessor().getFormacao().equalsIgnoreCase("Pós Graduação")) {
                retorno += d.getNome()+" - "+ d.getProfessor().getNome();
            }
        }
        return retorno;
    }
    }

