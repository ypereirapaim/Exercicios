/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DiadVidaExato {

   
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        LocalDate dtNascimento, hoje = LocalDate.now();
        long diasVida;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Calculo de dias de vida exato: ");
        System.out.print("Informe sua data de nascimento:  " );
        dtNascimento = LocalDate.parse(leia.next(),dtf);
        System.out.println("Data Nasc.: " + dtf.format(dtNascimento));
        System.out.print("data atual: " + dtf.format(hoje));
        diasVida = ChronoUnit.DAYS.between(dtNascimento, hoje);
        System.out.println("Dias de vida exato: " + diasVida);
        
        
        
    }
    
}
