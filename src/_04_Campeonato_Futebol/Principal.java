package _04_Campeonato_Futebol;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Time> times = new ArrayList<Time>();

        String menu = "1 - Cadastrar time\n" +
                "2 - Listar time\n" +
                "3 - Exibir artilheiro\n" +
                "4 - Exibir time com mais gols\n\n" +
                "5 - Sair";

        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

        do {
            Time t = new Time();
            switch (op) {
                case 1:
                    t.Cadastrar();
                    times.add(t);
                    op = 0;
                    break;
                case 2:
                    if (times.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há times cadastrados");
                        op = 0;
                        break;
                    }
                    String timeselec = JOptionPane.showInputDialog(null, "Ensira qual o time");
                    for(Time ti: times) {
                        if (ti.getNome().equals(timeselec)) {
                        JOptionPane.showMessageDialog(null, ti.Exibir());
                        }
                    }
                    op = 0;
                    break;
                case 3:
                    if (times.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há times cadastrados");
                        op = 0;
                        break;
                    }
                    Jogador art = new Jogador();
                    for (Time ti: times) {
                        ti.ArtilheiroTime();
                        if (ti.ArtilheiroTime().getGols() > art.getGols()) {
                            art = ti.ArtilheiroTime();
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Artilheiro do campeonato: "+art.getNome());

                    op = 0;
                    break;
                case 4:
                    if (times.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não há times cadastrados");
                        op = 0;
                        break;
                    }
                    Time tim = new Time();
                    for (Time ti: times) {
                        if (ti.GetGolsTime() > tim.GetGolsTime()) {
                            tim = ti;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Time com mais gols: "+tim.getNome());
                    op = 0;
                    break;
                default:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            }
        } while (op != 5);
    }
}
