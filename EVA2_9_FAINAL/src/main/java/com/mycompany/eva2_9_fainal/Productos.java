/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_fainal;

/**
 *
 * @author TERN04
 */
public  abstract class Productos {
    
    private String nombre;
    private double precio;
    
     public Productos() {
        this.nombre = "-";
        this.precio = 0.0;
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String cade;
        cade = "Nombre: " + nombre + "\n" + 
                "precio: " + precio;
        return cade;
    }
}
