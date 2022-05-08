/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear el primer objeto que haga referencia al constructor
        // sin argumentos
        
        PromedioEstudiante promEst = new PromedioEstudiante();
        
        // Llamar al método que calcula el promedio de las calificaciones
        promEst.establecerPromedioCalificaciones();
        
        System.out.println("Objeto sin argumentos\n");
        
        /* Se puede presentar la información de la siguiente manera:
        
            System.out.printf("Nombre del Estudiante: %s\n"
                + "Calificacion Materia 1: %.2f\n"
                + "Calificacion Materia 2: %.2f\n"
                + "Calificacion Materia 3: %.2f\n"
                + "Promedio Calificaciones: %.2f\n",
                promEst.obtenerNombreEstudiante(),
                promEst.obtenerCalificacionMateria1(),
                promEst.obtenerCalificacionMateria2(),
                promEst.obtenerCalificacionMateria3(),
                promEst.obtenerPromedioCalificaciones());*/
        
        // O haciendo uso del método toString:        
        System.out.printf("%s\n",promEst);
        
        // Se crea un objeto haciendo referencia al constructor 
        // con argumentos de la clase
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nObjeto con argumentos\n");
        
        // Establecer datos diferentes para el segundo objeto
        
        String nomEst2 = "Arancha Rosillo Andagua";
        double calif1 = 10;
        double calif2 = 10;
        double calif3 = 9;
        double promEstudiante2;
        
        // Crear un nuevo objeto que reciba los parámetros adecuados
        PromedioEstudiante promEst2 = new PromedioEstudiante(nomEst2, calif1, calif2, calif3);
        
        // Llamar al método que calcula el promedio de las calificaciones del segundo objeto
        promEst2.establecerPromedioCalificaciones();
        
        //Mostar los resultados en pantalla        
        System.out.printf("%s\n ",promEst2);
                
    }
}
