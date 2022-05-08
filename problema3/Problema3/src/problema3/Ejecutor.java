/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

/**
 *
 * @author DELL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto que haga referencia al constructor
        // sin argumentos
        
        Automotor auto1 = new Automotor();
        
        // Llamar a método que calcula el valor de la matrícula
        // del Auto N°1
        
        auto1.establecerValorMatricula();
        
        /* Se puede presentar la información de la siguiente manera:
        System.out.printf("Objeto sin argumentos\n\n"
                + "Cédula del dueño: %d\n"
                + "Marca del vehículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.3f\n"
                + "Valor de la matrícula: %.3f\n",
                auto1.obtenerCedulaDuenio(),
                auto1.obtenerMarcaVehiculo(),
                auto1.obtenerAnioFabricacion(),
                auto1.obtenerValorVehiculo(),
                auto1.obtenerValorMatricula());

        // O haciendo uso del metodo toString*/
        System.out.println("Objeto sin argumentos\n");
        System.out.printf("%s\n",auto1);       
        
        System.out.println("------------------------------");
        
        // Asignar valores a las variables a utilizar
        long cedulaDuenio2 = 1105911984L;
        String marcaVehiculo2 = "Kia Sportage";
        int anioFabricacion2 = 2019;
        int anioEnCurso = 2022;
        double valorVehiculo2 = 23000;
            
        // Crear un nuevo objeto que haga referencia al constructor
        // con argumentos
        
        Automotor auto2 = new Automotor(cedulaDuenio2, marcaVehiculo2, anioFabricacion2, anioEnCurso, valorVehiculo2);
        
        // Llamar al método que calcula el valor de la matrículo del auto N°2
        auto2.establecerValorMatricula();
        
        // Imprimir la información del auto N°2
        System.out.println("Objeto con argumentos\n");
        System.out.printf("%s\n", auto2);
    }   
}
