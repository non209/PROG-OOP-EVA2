/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_interface;

/**
 *
 * @author TERN04
 */
public class Persona implements Datos{
    private String nombre;
    private int edad;
    private String apellido;     
    
     public Persona() {
        this.nombre = "-";
        this.edad = 0;
        this.apellido = "-";
    }
    

    public Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellido);
        System.out.println("Edad: " + edad);
    }

    @Override
    public String GenerarNombreCom() {
        return nombre + " " + apellido;
    } 
}
