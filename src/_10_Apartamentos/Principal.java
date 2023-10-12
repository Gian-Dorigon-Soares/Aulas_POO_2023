package _10_Apartamentos;

import javax.swing.*;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Apartamento> Apartamentos = new ArrayList<>();
        ArrayList<contas> Contas = new ArrayList<>();
        String menu = "Escolha uma das opções a seguir:\n"+
                "____________________________________________________\n"+
                "1 - Cadastrar apartamento\n"+
                "2 - Cadastrar Contas\n"+
                "3 - Calcular divida mensal de todos os apartamentos\n"+
                "4 - Calcular divida mensal de um apartamento\n\n"+
                "0 - Sair";
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
        do {
            switch (op) {
                case 1:
                    Apartamento a = new Apartamento();
                    a.cadastrar();
                    Apartamentos.add(a);
                    op = 9;
                    break;
                case 2:
                    contas c = new contas();
                    c.cadastrar();
                    Contas.add(c);
                    op = 9;
                    break;
                case 3:
                    if (Contas.isEmpty() || Apartamentos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não a cadastros suficientes para listar!");
                        op = 9;
                        break;
                    } else {
                        dividasPorMes(Contas, Apartamentos);
                        op = 9;
                        break;
                    }
                case 4:
                    if (Contas.isEmpty() || Apartamentos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não a cadastros suficientes para listar!");
                        op = 9;
                        break;
                    } else {
                        dividasPorApartamento(Contas, Apartamentos);
                        op = 9;
                        break;
                    }
                default:
                    op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
                    break;
            }
        } while (op != 0);
    }

    public static void dividasPorMes(ArrayList<contas> Contas, ArrayList<Apartamento> Apartamentos) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira um mês de referencia"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ensira um ano de referencia"));
        if(mes>12 || mes<1 || ano>3000 || ano<1900) {
            JOptionPane.showMessageDialog(null, "Data inserida é invalida!");
            dividasPorMes(Contas, Apartamentos);
        } else {
            String Resultado = "";
            float Valorcontas = 0;
            for (contas c: Contas) {
                if (c.getMes_despesa() == mes && c.getAno_despesa() == ano) {
                    Valorcontas += c.getValor_despesa();
                }
            }
            for (Apartamento a: Apartamentos) {
                Resultado += "Apartamento "+a.getBloco()+"-"+a.getNumero()+" | Valor de despesa: "+((a.getMetragem()*5)+(Valorcontas/Apartamentos.size()))+ " reais\n";
            }
            JOptionPane.showMessageDialog(null, "Despesas do mês "+mes+"/"+ano+"\n" +
                    "__________________________________________\n" +
                    Resultado);
        }

    }
    public static void dividasPorApartamento(ArrayList<contas> Contas, ArrayList<Apartamento> Apartamentos) {
        int bloco = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do bloco do apartamento"));
        int apt = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número do apartamento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o mês de referência"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de referência"));

        if (mes > 12 || mes < 1 || ano > 3000 || ano < 1900) {
            JOptionPane.showMessageDialog(null, "Data inserida é inválida!");
        } else {
            Apartamento apartamentoSelecionado = null;
            for (Apartamento a : Apartamentos) {
                if (a.getBloco() == bloco && a.getNumero() == apt) {
                    apartamentoSelecionado = a;
                    break;
                }
            }
            if (apartamentoSelecionado != null) {
                float areaApartamento = apartamentoSelecionado.getMetragem();
                float valorCondominio = areaApartamento * 5;
                float totalDespesas = valorCondominio;
                for (contas conta : Contas) {
                    if (conta.getMes_despesa() == mes && conta.getAno_despesa() == ano) {
                        totalDespesas += conta.getValor_despesa();
                    }
                }
                JOptionPane.showMessageDialog(null, "Extrato de Despesas do Apartamento " + bloco + "-" + apt + " para " + mes + "/" + ano + ":\nTotal devido: R$" + totalDespesas);
            } else {
                JOptionPane.showMessageDialog(null, "Apartamento não encontrado!");
                dividasPorApartamento(Contas,Apartamentos);
            }
        }
    }


}
