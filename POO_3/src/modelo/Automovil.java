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
public class Automovil extends Terrestre{
    private String no_puertas,velocidad,no_ruedas;

    public Automovil(){}
    public Automovil(String no_puertas, String velocidad, String no_ruedas, String matricula, String motor, String marca, String modelo, String color, String precio, String Fecha_incio_actividad) {
        super(matricula, motor, marca, modelo, color, precio, Fecha_incio_actividad);
        this.no_puertas = no_puertas;
        this.velocidad = velocidad;
        this.no_ruedas = no_ruedas;
    }

    public String getNo_puertas() {
        return no_puertas;
    }

    public void setNo_puertas(String no_puertas) {
        this.no_puertas = no_puertas;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getNo_ruedas() {
        return no_ruedas;
    }

    public void setNo_ruedas(String no_ruedas) {
        this.no_ruedas = no_ruedas;
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
    
}
