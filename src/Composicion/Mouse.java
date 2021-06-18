package Composicion;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diego
 */
public class Mouse {
    private String marca;
    private String modelo;
    private String tipo;

    public Mouse(String marca, String modelo, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public Mouse() {
        this.marca = "Eagle Warrior";
        this.modelo = "2400DPI";
        this.tipo = "Alámbrico";
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Mouse{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + '}';
    }
    
}
