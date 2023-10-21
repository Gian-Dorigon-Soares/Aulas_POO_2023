package _13_Farmacia_Heranca;

import java.util.ArrayList;

public class Principal {


    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Produto> produtos = new ArrayList<>();

        clientes.add(new Cliente("Cliente1",0));
        clientes.add(new Cliente("Cliente2",0));
        clientes.add(new Cliente("Cliente3",0));

        produtos.add(new Medicamento("Medicamento1",10,20,true));
        produtos.add(new Medicamento("Medicamento2",5,20,false));
        produtos.add(new Perfumaria("Perfume1",10,50));
        produtos.add(new Produtos_Hospitalares("Hospitalar1",5,100));

        System.out.println("produtos:\n"
                +produtos.get(0)+produtos.get(1)+produtos.get(2)+produtos.get(3));
        System.out.println("clientes:\n"
                +clientes.get(0)+clientes.get(1)+clientes.get(2));

    }
}
