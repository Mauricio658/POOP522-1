/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author jimen
 */
public class Persona {
    //encapsulamiento
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
/**
 * 
 * @param nombre
 * @param apellido
 * @param fNacimiento 
 */
    public Persona(String nombre, String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
        
    }
    /**
     * 
     * @param nombre
     * @param apellido
     * @param dia
     * @param mes
     * @param anio 
     */
    public Persona(String nombre, String apellido,int dia,int mes,int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        //Opcion 1
        //Fecha fecha3= new Fecha(dia,mes,anio);
        //this.fNacimiento=fecha3;
        //Opcion 2
        //fNacimiento= new Fecha();
        //fNacimiento.setDia(dia);
        //fNacimiento.setMes(mes);
        //fNacimiento.setAnio(anio);
        //opcion 3
        fNacimiento= new Fecha(dia,mes,anio);
    }

    /**
     * 
     * @return Regresamos el nombre de la persona
     */
    //getters y setter
    public String getNombre() {
        return nombre;
    }
/**
 * Recibimos el nombre de la persona
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * 
 * @return Regresamos el apellido de la persona
 */
    public String getApellido() {
        return apellido;
    }
/**
 * Recibimos el apellido de la persona
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * 
 * @return Regresamos la fecha de Nacimiento
 */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
/**
 * Recibimos una fecha de Nacimiento
 * @param fNacimiento 
 */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
/**
 * 
 * @return  Los atributos que tenga el Objeto Persona creado
 */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + 
                apellido + ", fNacimiento=" + fNacimiento + '}';
    }

    
    
}
