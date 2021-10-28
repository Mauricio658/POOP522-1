/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author jimen
 */
public class Carro {
    //atributos
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private int kilometraje;
    private boolean estandar;
    private Persona pasajero1;
    private Persona pasajero2;
    private Persona copiloto;
    private Persona piloto;

    public Carro() {
    }
/**
 * Clase Carro que contiene todo lo necesario de un carro 
 * @param marca
 * @param modelo
 * @param color
 * @param anio
 * @param kilometraje
 * @param estandar
 * @param pasajero1
 * @param pasajero2
 * @param copiloto
 * @param piloto 
 */
    public Carro(String marca, String modelo, String color, int anio, int kilometraje, 
            boolean estandar, Persona pasajero1, Persona pasajero2, Persona copiloto, Persona piloto) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
        this.pasajero1=pasajero1;
        this.pasajero2=pasajero2;
        this.copiloto=copiloto ;
        this.piloto=piloto ;
    }
/**
 * 
 * @return marca del vehiculo
 */
    public String getMarca() {
        return marca;
    }
/**
 * Recibimos la marca del vehiculo
 * @param marca 
 */
    public void setMarca(String marca) {
        this.marca = marca;
    }
/**
 * 
 * @return modelo del vehiculo
 */
    public String getModelo() {
        return modelo;
    }
/**
 * Recibimos el modelo  del vehiculo
 * @param modelo 
 */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
/**
 * 
 * @return color del vehiculo
 */
    public String getColor() {
        return color;
    }
/**
 * Recibimos el Color del Vehiculo
 * @param color 
 */
    public void setColor(String color) {
        this.color = color;
    }
/**
 * 
 * @return El año del vehiculo
 */
    public int getAnio() {
        return anio;
    }
/**
 * Recibimos el año del vehiculo
 * @param anio 
 */
    public void setAnio(int anio) {
        this.anio = anio;
    }
/**
 * 
 * @return Kilometraje del vehiculo
 */
    public int getKilometraje() {
        return kilometraje;
    }
/**
 * Recibimos el Kilometraje del Vehiculo
 * @param kilometraje 
 */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
/**
 * 
 * @return True si el vehiculo es estandar
 */
    public boolean isEstandar() {
        return estandar;
    }
/**
 * Recibimos True si el vehiculo es estandar
 * @param estandar 
 */
    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }
/**
 * 
 * @return Pasajero 1 del Vehiculo 
 */
    public Persona getPasajero1() {
        return pasajero1;
    }
/**
 * Recibimos la primera Persona que aborda el vehiculo 
 * @param pasajero1 
 */
    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }
/**
 * 
 * @return Pasajero 2 del Vehiculo
 */
    public Persona getPasajero2() {
        return pasajero2;
    }
/**
 * Recibimos la segunda Persona que aborda el vehiculo 
 * @param pasajero2 
 */
    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
/**
 * 
 * @return Copiloto del Vehiculo
 */
    public Persona getCopiloto() {
        return copiloto;
    }
/**
 * Recibimos el Copiloto que aborda el Vehiculo
 * @param copiloto 
 */
    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }
/**
 * 
 * @return Piloto del Vehiculo
 */
    public Persona getPiloto() {
        return piloto;
    }
/**
 * Recibimos el Piloto que aborda el Vehiculo
 * @param piloto 
 */
    public void setPiloto(Persona piloto) {
        this.piloto = piloto;
    }

  /**
   * Recibimos el lugar a donde se va a visitar
   * @param lugar 
   */      
    public void irAUnLugar(String lugar){
        System.out.println("Estoy visitando a: "+lugar);
    }
    /**
     * Recibimos el nombre del comprador del Vehiculo
     * @param comprador 
     */
    public void venderCarro(String comprador){
        System.out.println("Vendi mi coche a: "+comprador);
    }
    /**
     * Recibimos el porcentaje de Gasolina con la que cuenta el vehiculo
     * @param porcentaje 
     */
    public void gasolina(int porcentaje){
        System.out.println("Tengo: "+porcentaje+" porcentaje de gasolina");
    }
    /**
     * Aqui determinamos si el carro necesita Servicio Mecanico
     */
    public void servicio(){
        if(kilometraje>50000){
            System.out.println("El carro necesita servicio");
        }else{
            System.out.println("Aun falta para llevarlo a servicio");
        }
    }
    /**
     * Recibimos el tiempo del trayecto de visita a un lugar
     * @param tiempoHora 
     */
    public void recorrido(float tiempoHora){
        System.out.println("El tiempo de trayecto es: "+tiempoHora+" horas");
        
    }
/**
 * 
 * @return Los atributos del vehiculos y las 4 personas del carro
 */
@Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + 
                ", anio=" + anio + ", kilometraje=" + kilometraje + ", estandar=" + estandar +
                ", pasajero1=" + pasajero1 + ", pasajero2=" + pasajero2 + ", copiloto=" + copiloto
                + ", piloto=" + piloto + '}';
    }

    

    
    
    
}
