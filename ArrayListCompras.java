package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListCompras {

    static ArrayList<String> item = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("SISTEMA DE COMPRAS!!!");
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    ArrayListItem();
                    menu2();
                    break;
                case 2:
                    ArrayListLista();
                    break;
                case 3:
                    ArrayListRemove();
                    break;
                case 4:
                    System.out.println("PROGRAMA ENCERRADO!!!");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!!!");
                    break;
            }
        } while (opM != 4);

    }

    public static void menu() {
        System.out.println(" 1 - Adicionar Item");
        System.out.println(" 2 - Listar Item");
        System.out.println(" 3 - Remover Item");
        System.out.println(" 4 - Finalizar o Programa");
        System.out.print("Digite Aqui: ");

    }

    public static void ArrayListItem() {
        System.out.println("Digite o item para adicionar: ");
        item.add(leia.nextLine());
    }

    public static void ArrayListLista() {

        System.out.println("Quantos Itens temos na lista: " + item.size());
        Collections.sort(item);
        for (Iterator<String> it = item.iterator(); it.hasNext();) {
            String item = it.next();
            System.out.println(item);
        }
    }

    public static void ArrayListRemove() {
        System.out.println("Digite um Item: ");
        item.remove(leia.nextLine());
    }

    public static void menu2() {
        int opc;
        do {
            System.out.println(" 1 - ADICIONAR ITEM");
            System.out.println(" 0 - SAIR");
            System.out.print("DIGITE AQUI: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    ArrayListItem();
                    break;
                case 0:
                    System.out.println("0 PARA SAIR");
                    break;
            }
        } while (opc != 0);
    }
}
