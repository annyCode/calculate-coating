package br.com.lets;

import java.util.ArrayList;
import java.util.Scanner;

public class ComodoController {

    Scanner leitor;
    ArrayList<Comodo> lista;

    public ComodoController() {
        this.leitor = new Scanner(System.in);
        this.lista = new  ArrayList();
    }

    public void capturarComodo(){
        Comodo comodo = new Comodo();
        System.out.println("--- Calcular Revestimento ---");
        System.out.println("Informe o nome do cômodo que deseja calcular: ");
        comodo.setName(leitor.next());
        System.out.println("Informe as medidas do cômodo em metros");
        System.out.println("Largura: ");
        comodo.setLargura(leitor.nextDouble());

        System.out.println("Altura: ");
        comodo.setAltura(leitor.nextDouble());

        System.out.println("Informe o tipo do piso: ");
        comodo.setTipoPiso(leitor.next());

        lista.add(comodo);
        menu();

    }

    public void menu(){
        int opcao;

        System.out.println(" ---> MENU");
        System.out.println("1 - Informar outro cômodo");
        System.out.println("2 - Imprimir relatorio");
        System.out.println("3 - Sair");
        opcao = leitor.nextInt();

        switch (opcao){
            case 1:
                capturarComodo();
                break;
            case 2:
                imprimirRelatorio();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida");

        }
    }

    public void imprimirRelatorio(){
        System.out.println("--- Relatório ---");
        for (Comodo c: lista) {
            System.out.println(c.toString());
        }
        menu();
    }
}
