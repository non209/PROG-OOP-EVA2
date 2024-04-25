/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_clases_abstractas;

/**
 *
 * @author TERN04
 */
public class Triangulo {
    private double base;
   private double altura;
   
     public Triangulo() {
        base = 0;
        altura = 0;
    }
   
     public Triangulo(double base, double altura) {
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
        return (base * altura) / 2;
    }
    
    private double calcularhipo(){
        return Math.sqrt(Math.pow(base, 2 + Math.pow(altura, 2)));
    }

    @Override
    public double CalPeri() {
        return base + altura + calcularhipo();
    }
    
}
