/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

/**
 *
 * @author DELL
 */
public class PromedioEstudiante {
    
    private String nombreEstudiante;
    private double calificacionMateria1;
    private double calificacionMateria2;
    private double calificacionMateria3;
    private double prom;

    public PromedioEstudiante(){
        nombreEstudiante = "Ana Carolina Briceño";
        calificacionMateria1 = (9.8);
        calificacionMateria2 = (10);
        calificacionMateria3 = (9.5);    
    }
    
    public PromedioEstudiante(String nom, double m1, double m2, double m3){
        nombreEstudiante = nom;
        calificacionMateria1 = m1;
        calificacionMateria2 = m2;
        calificacionMateria3 = m3;          
    }
    
    public void establecerNombreEstudiante(String n){
        nombreEstudiante = n;
    }
    
    public void establecerCalificacionMateria1(double a) {
        calificacionMateria1 = a;
    }
    
    public void establecerCalificacionMateria2(double a) {
        calificacionMateria2 = a;
    }
    
    public void establecerCalificacionMateria3(double a) {
        calificacionMateria3 = a;
    }
    
    public void establecerPromedioCalificaciones(){
        prom = (calificacionMateria1 + calificacionMateria2 + calificacionMateria3)/3;
    }
    
    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }
    
    public double obtenerCalificacionMateria1(){
        return calificacionMateria1;
    }
    
    public double obtenerCalificacionMateria2(){
        return calificacionMateria2;
    }
    
    public double obtenerCalificacionMateria3(){
        return calificacionMateria3;
    }
    
    public double obtenerPromedioCalificaciones(){
        return prom;
    }
    
    public String toString(){
        String cadena = String.format("Nombre del estudiante: %s\n"
                +"Calificación de materia 1: %.2f\n"
                +"Calificación de materia 2: %.2f\n"
                +"Calificación de materia 3: %.2f\n"
                +"Promedio de calificaciones: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificaciones());
        return cadena;
    }    
}
