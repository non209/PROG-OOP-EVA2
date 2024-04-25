/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_7_libreri;

/**
 *
 * @author TERN04
 */
public class Libros extends Publicaciones {

    public Libros() {
        super();
        this.autor = "-";
    }

    public Libros(String autor, String titulo, double precio, int copias) {
        super(titulo, precio, copias);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void OrdenarCopias(int cant) {

        int existencias = getCopias();
        setCopias(existencias + cant);
    }

    @Override
    public void ImprimirDatos() {
        super.ImprimirDatos();
        System.out.println("Autor: " + autor);
    }

}
