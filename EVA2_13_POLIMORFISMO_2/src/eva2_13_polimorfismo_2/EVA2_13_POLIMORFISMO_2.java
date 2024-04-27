/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author TERN04
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*persona perso1 = new persona("Raul", "Jimenez");
        persona perso2 = new persona("VANIA", "MORENO");
        persona perso3 = new persona("FRUTA", "VEGETAL");
        
        estudiante estu1 = new estudiante("6554545", "GG", "LL");
        estudiante estu3 = new estudiante("1515445", "AA", "BB");
        estudiante estu2 = new estudiante("5454115", "ZZ", "XX");
        
        imprimirdatos(perso1);
       
        System.out.println("");
        imprimirdatos(perso2);
        
        System.out.println("");
        imprimirdatos(perso3);
        
        System.out.println("");
        imprimirdatos(estu1);
        
        System.out.println("");
        imprimirdatos(estu2);
        
        System.out.println("");
        imprimirdatos(estu3); */
        
        estudiante estudiantes[] = new estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new estudiante("00000", "SIN DATOS", "SIN DATOS");
        }
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirdatos(estudiantes[i]);
            System.out.println("");
        }
    }
    
    public static void imprimirdatos(MostrarDatos datos){
        datos.imprimirdatos();
        //CASTING
        estudiante estu;
        persona perso;
        
        if(datos instanceof estudiante){
            estu = (estudiante)datos;
        
        }else{
            perso = (persona)datos;
        }
    
    }
    
}
