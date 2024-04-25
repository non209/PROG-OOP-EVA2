/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author TERN04
 */
public class Circulo {
    private double radio;
    
    public Circulo(){
        radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    
    @Override
    public double CalArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double CalPeri() {
        return Math.PI * (radio * 2);
    }
}
