/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_1_sobrecarga_metodos;

/**
 *
 * @author TERN04
 */
public class EVA2_1_SOBRECARGA_METODOS {

    public static void main(String[] args) {
        System.out.println("La suma de 54 + 47 = " + sumar(54, 47));
        System.out.println("La suma de 54.2 + 78.3 = " + sumar(54.2, 78.3));
        System.out.println("La suma de 'Hola' + '   Mundo' = " + sumar("Hola", " Mundo"));
        sumar();
    }

    public static int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static String sumar(String num1, String num2) {
        return num1 + num2;
    }

    public static void sumar() {
        System.out.println("Metodo que no hace nada");
    }
}
