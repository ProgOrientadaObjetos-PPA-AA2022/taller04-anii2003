/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author DELL
 */
public class ChequeEntidadFinanciera {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;
    
    public ChequeEntidadFinanciera(){
        nombreCliente = "Ana Carolina Churo Briceño";
        nombreBanco = "Banco de Loja";
        valorCheque = 500.60;
    }
    
    public ChequeEntidadFinanciera(String n, String b, double vch){
        nombreCliente = n;
        nombreBanco = b;
        valorCheque = vch;
    }
    
    public void establecerNombreCliente(String n){
        nombreCliente = n;
    }
    
    public void establecerNombreBanco(String b){
        nombreBanco = b;
    }
    
    public void establecerValorCheque(double valorDelCheque){
        valorCheque = valorDelCheque;
    }
    
    public void establecerComisionBanco(){
        comisionBanco = ((valorCheque*0.003)/100);
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public String obtenerNombreBanco(){
        return nombreBanco;
    }
    
    public double obtenerValorCheque(){
        return valorCheque;
    }
    
    public double obtenerComisionBanco(){
        return comisionBanco;
    }
    
    public String toString(){
        String cadena = String.format("Nombre del cliente: %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f\n",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionBanco());
        return cadena;
    }
}
