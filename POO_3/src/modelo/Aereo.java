/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Juárez Arevalo
 */
public class Aereo extends Vehiculo{
    private String cantidad_motores,capacidad,velocidad;

    public Aereo(){}
    public Aereo(String cantidad_motores, String capacidad, String velocidad, String marca, String modelo, String color, String precio, String Fecha_incio_actividad) {
        super(marca, modelo, color, precio, Fecha_incio_actividad);
        this.cantidad_motores = cantidad_motores;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public String getCantidad_motores() {
        return cantidad_motores;
    }

    public void setCantidad_motores(String cantidad_motores) {
        this.cantidad_motores = cantidad_motores;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public void arrancar (){
    System.out.println("Metodo Arrancar");
    System.out.println("_______________");
    }
    
    @Override
    public void detener (){
    System.out.println("Metodo Detener");
    System.out.println("______________");
    }
    
    @Override
    public void acelerar (){
    System.out.println("Metodo Acelerar");
    System.out.println("_______________");
    }
    
    @Override
    public void frenar (){
    System.out.println("Metodo Acelerar");
    System.out.println("_______________");
    }
    
    @Override
    public void verprecio (){
    System.out.println("Precio: " + this.getPrecio());
    System.out.println("_______________");
    } 
    // Metodos propios
    public void elevar(){
    System.out.println("Metodo Elevar");
    System.out.println("_______________");  
    }
    
    public void decender(){
    System.out.println("Metodo Decender");
    System.out.println("_______________");  
    }
    
}
