/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author DELL
 */
public class ProfesorInstituto {
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private double sueldoTotal;
    private long cedula;
    
    public ProfesorInstituto(){
        nombre = "Antonieta";
        apellido = "León";
        sueldoBasico = 465;
        cedula = 1106053190L;
    }
    
    public ProfesorInstituto(String n, String a, double sb, long c){
        nombre = n;
        apellido = a;
        sueldoBasico = sb;
        cedula = c;
    }
    
    public void establecerNombre(String a){
        nombre = a;
    }
    
    public void establecerApellido(String a){
        apellido = a;
    }
    
    public void establecerSueldoBasico(double sueldoB) {
        sueldoBasico = sueldoB;
    }
    
    public void establecerSueldoTotal(){
        sueldoTotal = sueldoBasico + (sueldoBasico*0.2);
    }
    
    public void establecerNumeroCedula(long ced){
        cedula = ced;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerApellido(){
        return apellido;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public long obtenerNumeroCedula(){
        return cedula;
    }
    
    public String toString(){
        String cadena = String.format("Nombre: %s\n"
        + "Apellido: %s\n"
        + "Sueldo Básico: %.2f\n"
        + "Sueldo Total: %.2f\n"
        + "Cédula: %d", obtenerNombre(),
        obtenerApellido(),
        obtenerSueldoBasico(),
        obtenerSueldoTotal(),
        obtenerNumeroCedula());
        
        return cadena;
    }   
}
