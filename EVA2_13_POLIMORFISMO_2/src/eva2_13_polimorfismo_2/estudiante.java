/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author TERN04
 */
public class estudiante extends persona{
    private String nocontrol;
        
         public estudiante() {
            super();
            nocontrol = "";
        }

        public estudiante(String nocontrol, String nombre, String apellido) {
            super(nombre, apellido);
            this.nocontrol = nocontrol;
        }

        public String getNocontrol() {
            return nocontrol;
        }

        public void setNocontrol(String nocontrol) {
            this.nocontrol = nocontrol;
        }
           
    @Override
        public String toString(){
            return super.toString() + "" + nocontrol;
        }
        
    @Override
         public void imprimirdatos(){
            super.imprimirdatos();
            System.out.println("Numero de control: " + nocontrol);
            
        }
}
