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
public class Vehiculo {
    private String marca,modelo,color,precio,Fecha_incio_actividad;

    public Vehiculo(){}
    public Vehiculo(String marca, String modelo, String color, String precio, String Fecha_incio_actividad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.Fecha_incio_actividad = Fecha_incio_actividad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFecha_incio_actividad() {
        return Fecha_incio_actividad;
    }

    public void setFecha_incio_actividad(String Fecha_incio_actividad) {
        this.Fecha_incio_actividad = Fecha_incio_actividad;
    }
    
    public void arrancar(){}
    public void detener(){}
    public void acelerar(){}
    public void frenar(){}
    public void verprecio(){}
    
}
