/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;
import java.util.Scanner;

/**
 *
 * @author 181810146
 */
public class DiasVida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade, diasdeVida;
        System.out.println(":::Calc dias de vida:::");
        System.out.println("Digite sua idade: ");
         idade = leia.nextInt();
         diasdeVida = idade * 365;

        System.out.println("Você tem aproximadamente " +diasdeVida+ " de vida");
         
    }//LocalDate dtNasc, dtAtual = localDate.now();
    //DateFormat df = new DateFormat("dd/mm/yyyy")
    //system.out.println(dtAtual);
    
}
