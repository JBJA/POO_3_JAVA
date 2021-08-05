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
public class Moto extends Terrestre{
    private String cilindros,tipo,no_ruedas;

    public Moto(){}
    public Moto(String cilindros, String tipo, String no_ruedas, String matricula, String motor, String marca, String modelo, String color, String precio, String Fecha_incio_actividad) {
        super(matricula, motor, marca, modelo, color, precio, Fecha_incio_actividad);
        this.cilindros = cilindros;
        this.tipo = tipo;
        this.no_ruedas = no_ruedas;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
