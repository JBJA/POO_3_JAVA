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
public class Helicoptero extends Aereo{
    private String no_elices,tipo;

    public Helicoptero(){}
    public Helicoptero(String no_elices, String tipo, String cantidad_motores, String capacidad, String velocidad, String marca, String modelo, String color, String precio, String Fecha_incio_actividad) {
        super(cantidad_motores, capacidad, velocidad, marca, modelo, color, precio, Fecha_incio_actividad);
        this.no_elices = no_elices;
        this.tipo = tipo;
    }

    public String getNo_elices() {
        return no_elices;
    }

    public void setNo_elices(String no_elices) {
        this.no_elices = no_elices;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    @Override
    public void elevar(){
    System.out.println("Metodo Elevar");
    System.out.println("_______________");  
    }
    
    @Override
    public void decender(){
    System.out.println("Metodo Decender");
    System.out.println("_______________");  
    }
    
}
