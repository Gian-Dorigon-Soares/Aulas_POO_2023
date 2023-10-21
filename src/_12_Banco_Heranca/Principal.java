package _12_Banco_Heranca;
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<Conta>();
        contas.add(new Conta(1, 1, "CORRENTE", 0));
        contas.add(new Conta_Especial(2, 2, "ESPECIAL", 0, 1000));
        contas.add(new Conta_Universitaria(3, 3, "UNIVERSITÁRIA", 0));
        Caixa.depositar(contas.get(0),100.0);
        System.out.println(contas.get(0).toString());
        Caixa.sacar(contas.get(0), 200.0);
        System.out.println(contas.get(0).toString());
        Caixa.transferir(contas.get(0),contas.get(1), 100.0);
        System.out.println(contas.get(0).toString()+contas.get(1).toString());
        Caixa.depositar(contas.get(0),4000.0);
        Caixa.transferir(contas.get(0),contas.get(2), 3000.0);
        System.out.println(contas.get(0).toString()+contas.get(2).toString());
        Caixa.sacar(contas.get(1), 200.0);
        System.out.println(contas.get(1).toString());
        Caixa.sacar(contas.get(1), 3000.0);
        System.out.println(contas.get(1).toString());
        Caixa.sacar(contas.get(0), 5000.0);
        System.out.println(contas.get(0).toString());
    }
}
