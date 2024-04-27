/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_polimorfismo;

/**
 *
 * @author TERN04
 */
public class EVA2_12_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       


       
        estudiante estu = new estudiante("311122", "JORGE", "HERNANNDEZ");
        System.out.println(estu);

        persona perso = estu;
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("Apellidos: " + perso.getApellido());

        persona perso1 = new persona("IVAN", "NINA");
        System.out.println(perso1);

      
    }

}

class persona {

    String nombre;
    String apellido;

    public persona() {
        nombre = "";
        apellido = "";
    }

    public persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}

class estudiante extends persona {

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
}


