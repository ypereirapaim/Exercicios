/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.ArrayList;
import java.util.Scanner;
import model.Carro;


/**
 *
 * @author jbferraz
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car1 = new Carro("abc1234", 321, "Fiat", "Palio",
                2008, 2009, 1.0f, "Manual", "Hidraulica");
        System.out.println("Carro 1: " + car1.toString());
        System.out.println("Marca: " + car1.getMarca());
        System.out.println("Placa: " + car1.getPlaca());

        System.out.println("------------");
        Scanner leia = new Scanner(System.in);
        String placa;
        int renavan;
        String marca;
        String modelo;
        int anoFabricacao;
        int anoModelo;
        float motorizacao;
        String tpCambio;
        String tpDirecao;

        System.out.print("Informe a placa: ");
        placa = leia.next();
        System.out.print("Informe o renavam em numeros: ");
        renavan = leia.nextInt();
        System.out.print("Informe a marca: ");
        marca = leia.next();
        System.out.print("Informe o modelo: ");
        modelo = leia.next();
        System.out.print("Informe o ano Fab.: ");
        anoFabricacao = leia.nextInt();
        System.out.print("Informe o ano Mod.: ");
        anoModelo = leia.nextInt();
        System.out.print("Informe a motorização do carro: ");
        motorizacao = leia.nextFloat();
        System.out.print("Informe tipo de câmbio: ");
        tpCambio = leia.next();
        System.out.print("Informe tipo direção: ");
        tpDirecao = leia.next();
        Carro car2 = new Carro(placa, renavan, marca, modelo,
                anoFabricacao, anoModelo, motorizacao, tpCambio, tpDirecao);
        System.out.println("Carro 2: " + car2.toString());

        Carro car3 = new Carro();
        car3.setPlaca("ipi3801");
        car3.setRenavan(321321);
        car3.setMarca("Peugeot");
        car3.setModelo("405 GRI");
        car3.setAnoFabricacao(1995);
        car3.setAnoModelo(1996);
        car3.setMotorizacao(1.8f);
        car3.setTpCambio("Manual");
        car3.setTpDirecao("Hidraulica");
        System.out.println("Carro 3: " 
                + car3.getMarca()
                + " | " + car3.getModelo());
        
        ArrayList<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(car1);
        listaCarros.add(car2);
        listaCarros.add(car3);
        
        for (Carro car : listaCarros) {
            System.out.println("Placa: " + car.getPlaca() 
                    + "\nModelo" + car.getModelo());
        }
        
        System.out.println("Lista sem car2");
        listaCarros.remove(car2);
        for (Carro car : listaCarros) {
            System.out.println("Placa: " + car.getPlaca() 
                    + "\nModelo" + car.getModelo());
        }

    }//fim da main

}