/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author DELL
 */
public class Automotor {
    private long cedulaDuenio;
    private String marcaVehiculo;
    private int anioFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int anioEnCurso;
    
    // Constructor N°1
    public Automotor(){
        cedulaDuenio = 1106053190L;
        marcaVehiculo = "Kia Rio";
        anioFabricacion = 2018;
        valorVehiculo = 18500;
        anioEnCurso = 2022;
    }
    
    public Automotor(long c, String m, int a,int ac, double vv){
        cedulaDuenio = c;
        marcaVehiculo = m;
        anioFabricacion = a;
        valorVehiculo = vv;
        anioEnCurso = ac;        
    }
    
    public void establecerCedulaDuenio(long ced){
        cedulaDuenio = ced;
    }
    
    public void establecerMarcaVehiculo(String marca){
        marcaVehiculo = marca;
    }
    
    public void establecerAnioFabricacion(int anio){
        anioFabricacion = anio;
    }
    
    public void establecerValorVehiculo(double valorVehi){
        valorVehiculo = valorVehi;
    }
    
    public void establecerValorMatricula() {
        valorMatricula = ((valorVehiculo * 0.002)/100)*(anioEnCurso-anioFabricacion);
    }
    
    public long obtenerCedulaDuenio(){
        return cedulaDuenio;
    }
    
    public String obtenerMarcaVehiculo(){
        return marcaVehiculo;
    }
    
    public int obtenerAnioFabricacion(){
        return anioFabricacion;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMatricula(){
        return valorMatricula;
    }
    
    public String toString(){
        String cadena = String.format("Cédula del dueño: %d\n"
                + "Marca del vehículo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matrícula: %.2f\n",
                obtenerCedulaDuenio(),
                obtenerMarcaVehiculo(),
                obtenerAnioFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        
        return cadena;
    }
}
