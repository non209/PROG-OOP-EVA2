/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author TERN04
 */
public class Rectangulo {
    private double base;
   private double altura;
   
     public Rectangulo() {
        base = 0;
        altura = 0;
    }
   
     public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double CalArea() {
        return base * altura;
    }

    @Override
    public double CalPeri() {
        return (base * 2) + (altura * 2);
    }
    
}
