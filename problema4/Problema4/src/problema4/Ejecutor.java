/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

/**
 *
 * @author DELL
 */
public class Ejecutor {
    public static void main(String[] args) {
        // Crear un nuevo objeto que haga referencia al constructor
        // sin argumentos       
        ChequeEntidadFinanciera cheque1 = new ChequeEntidadFinanciera();
        
        // Llamar a la función que calcular el valor de comisión del Banco
        cheque1.establecerComisionBanco();
        
        // Se puede presentar la información de la siguiente manera
        
        /*System.out.printf("Objeto sin argumentos\n"
                + "\nNombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f\n",
                cheque1.obtenerNombreCliente(),
                cheque1.obtenerNombreBanco(),
                cheque1.obtenerValorCheque(),
                cheque1.obtenerComisionBanco());*/
        
        // O haciendo uso del método toString
        System.out.println("Objeto sin argumentos\n");
        System.out.printf("%s\n",cheque1);

        
        System.out.println("-----------------------------------------------------");
        System.out.println("Objeto con argumentos\n");
        
        // Establecer valores para las variables a utilizar en el nuevo objeto
        String nombreCliente2 = "Arancha Estrella Rosillo Andagua";
        String nombreBanco2 = "Banco de Pichincha";
        double valorCheque2 = 1350.30;
        double comisionBanco2;
        
        // Crear un nuevo objeto que haga referencia al constructor
        // con argumentos
        
        ChequeEntidadFinanciera cheque2 = new ChequeEntidadFinanciera(nombreCliente2,
                nombreBanco2, valorCheque2);
        
        // Llamar al método que calcular el valor de la comisión que cobra el banco
        cheque2.establecerComisionBanco();
        
        // Imprimir los datos en pantalla
        System.out.printf("%s\n",cheque2);    
        
    }
}
