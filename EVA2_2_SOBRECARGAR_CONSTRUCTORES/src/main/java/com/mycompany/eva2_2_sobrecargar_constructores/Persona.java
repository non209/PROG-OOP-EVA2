/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_2_sobrecargar_constructores;

/**
 *
 * @author TERN04
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        nombre = "Sin nombre";
        apellidos = "Sin apellidos";
        edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void Imprimirdatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos; " + apellidos);
        System.out.println("Edad: " + edad);
    }

}
