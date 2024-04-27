/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author TERN04
 */
public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion direc = new Direccion ("HACIENDA SANTA CLARA", "SANTA CLARA", 311122, "2227", "CHIHUAHUA ", "CHIHUAHUA");
        Persona perso = new Persona("JORGE", "HERNANDEZ", 18, direc);
        System.out.println(perso);
    }
    
}
