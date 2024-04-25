/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_10_interface;

/**
 *
 * @author TERN04
 */
public class Estudiante extends Persona implements Datos, GenerarFecha{
    private String Nocontrol;

    public Estudiante() {
        this.Nocontrol = "-";
    }

    public Estudiante(String Nocontrol, String nombre, int edad, String apellido) {
        super(nombre, edad, apellido);
        this.Nocontrol = Nocontrol;
    }

    public String getNocontrol() {
        return Nocontrol;
    }

    public void setNocontrol(String Nocontrol) {
        this.Nocontrol = Nocontrol;
    }

    @Override
    public void ImprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellido());
        System.out.println("Nombre completo: " + GenerarNombreCom());
        System.out.println("Edad: " + getEdad());
        System.out.println("Año de nacimiento: " + RegresarAño());
    }

    @Override
    public String GenerarNombreCom() {
        return getNombre() + " " + getApellido();
    }

    @Override
    public int RegresarAño() {
        return 2024 - getEdad();
    }
}
