/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_3_vehiculo;

/**
 *
 * @author TERN04
 */
public class EVA2_3_VEHICULO {

    public static void main(String[] args) {
        Vehiculo car = new Vehiculo();
        car.imprimirdatos();

        System.out.println("");

        Vehiculo car2 = new Vehiculo("Ford", "Raptor", 2024, "negro");
        car2.imprimirdatos();
    }

}
