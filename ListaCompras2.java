/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jbferraz
 */
public class ListaCompras2 {

    static ArrayList<String> listaCompras2 = new ArrayList<>();
    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opM;
        do {
            menu();
            opM = leia.nextInt();
            switch (opM) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    imprimirLista();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }//fim switch
        } while (opM != 0);
    }//fim da main

    public static void menu() {
        System.out.println(".: Lista de Compras :.");
        System.out.println("1 - Adicionar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Imprimir lista");
        System.out.println("0 - Sair");
        System.out.print("Digite aqui: ");
    }//fim do menu

    public static void addItem() {
        Scanner ler = new Scanner(System.in);
        String add, item;
        //char add;
        do {
            System.out.print("Digite o item aqui: ");
            item = ler.nextLine();
            if (!verItem(item)) {
                listaCompras2.add(item);
            }else{
                System.out.println("Item já existe!");
            }
            System.out.println("Deseja adionar mais itens? S/N");
            add = ler.nextLine();
            //add = leia.next().charAt(1);
        } while (add.equalsIgnoreCase("s"));
        //} while (add == 's' || add == 'S');
    }//fim do add

    public static void removeItem() {
        Scanner ler = new Scanner(System.in);
        String add, item;
        do {
            System.out.print("Digite o item a ser removido aqui: ");
            item = ler.nextLine();
            if (verItem(item)) {
                listaCompras2.remove(item);
            }else{
                System.out.println("Item não existe!");
            }
            System.out.println("Deseja remover mais itens? S/N");
            add = ler.nextLine();
        } while (add.equalsIgnoreCase("s"));
    }//fim do remove

    public static void imprimirLista() {
        System.out.println(".: Itens da lista :.");
        Collections.sort(listaCompras2);
        for (String itemLista : listaCompras2) {
            System.out.println("  " + itemLista);
        }
    }//fim do imprimirLista    
    
    public static boolean verItem(String item){
        for (String itemLista : listaCompras2) {
            if (itemLista.equalsIgnoreCase(item)) {
                return true;
            }
        }
        return false;
    }//fim verItem
    
}