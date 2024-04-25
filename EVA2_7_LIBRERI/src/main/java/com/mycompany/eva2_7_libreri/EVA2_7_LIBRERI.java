/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_7_libreri;

/**
 *
 * @author TERN04
 */
public class EVA2_7_LIBRERI {

    public static void main(String[] args) {
        Libros libro = new Libros("Juan", "El rey de nascar", 89.65, 80);
        libro.ImprimirDatos();
        libro.VenderCopias(5);
        System.out.println("");
        libro.ImprimirDatos();
        libro.OrdenarCopias(100);
        System.out.println("");
        libro.ImprimirDatos();
        libro.VenderCopias(20);
        System.out.println("");
        libro.ImprimirDatos();
    }
}
