/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author jbferraz
 */
public class Carro {
    private String placa;
    private int renavan;
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int anoModelo;
    private float motorizacao;
    private String tpCambio;
    private String tpDirecao;

    /**
     * Construtor vazio
     */
    public Carro() {
    }

    public Carro(String placa, int renavan, String marca, String modelo, 
            int anoFabricacao, int anoModelo, float motorizacao, 
            String tpCambio, String tpDirecao) {
        this.placa = placa;
        this.renavan = renavan;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.motorizacao = motorizacao;
        this.tpCambio = tpCambio;
        this.tpDirecao = tpDirecao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getRenavan() {
        return renavan;
    }

    public void setRenavan(int renavan) {
        this.renavan = renavan;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }

    public String getTpCambio() {
        return tpCambio;
    }

    public void setTpCambio(String tpCambio) {
        this.tpCambio = tpCambio;
    }

    public String getTpDirecao() {
        return tpDirecao;
    }

    public void setTpDirecao(String tpDirecao) {
        this.tpDirecao = tpDirecao;
    }

    @Override
    public String toString() {
        return "Carro{" + "placa=" + placa + ", renavan=" + renavan + ", marca=" + marca + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo + ", motorizacao=" + motorizacao + ", tpCambio=" + tpCambio + ", tpDirecao=" + tpDirecao + '}';
    }
    
    
    
}