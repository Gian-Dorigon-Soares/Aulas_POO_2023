package _12_Banco_Heranca;

import javax.swing.*;
import java.util.ArrayList;

public class Caixa {

    public static boolean depositar (Conta origem, Double valor) {
        return origem.deposito(valor);
    }

    public static boolean sacar (Conta origem, Double valor) {
        return origem.saque(valor);
    }

    public static boolean transferir (Conta origem, Conta destino, Double valor) {
        return origem.transferencia(destino, valor);
    }
}
