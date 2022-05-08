/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

/**
 *
 * @author DELL
 */
public class Ejecutor {

    public static void main(String[] args) {
        // Crear un nuevo objeto que haga referencia al constructor sin argumentos
        
        ProfesorInstituto prof1 = new ProfesorInstituto();
        
        // Llamar al método que calcula el sueldo total del profesor 1
        prof1.establecerSueldoTotal();
        
        /* Se puede presentar la información de la siguiente manera:
        
        System.out.printf("Objeto sin argumentos:\n"
                + "\nNombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo básico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Número de cédula: %d\n", prof1.obtenerNombre(),
                prof1.obtenerApellido(), prof1.obtenerSueldoBasico(),
                prof1.obtenerSueldoTotal(), prof1.obtenerNumeroCedula());*/
        
        // O haciendo uso del método toString
        System.out.printf("%s\n",prof1);
        
        System.out.println("----------------------------------------------");
        
        // Asignar valores a las variables a ser usadas        
        String nombre2 = "Celia";
        String apellido2 = "Sarango";
        double sueldoBasico2 = 425;
        double sueldoTotal2;
        long cedula2 = 1105911984L;
        
        // Crear un nuevo objeto que haga referencia al constructor
        // con argumentos
        System.out.println("Objeto con argumentos\n");  
        
        ProfesorInstituto prof2 = new ProfesorInstituto(nombre2, apellido2,
        sueldoBasico2, cedula2);
        
        prof2.establecerSueldoTotal();
        
        System.out.printf("%s\n",prof2);
    }    
}
