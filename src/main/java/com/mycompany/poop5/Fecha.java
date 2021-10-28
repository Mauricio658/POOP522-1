/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author jimen
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
    }
/**
 * 
 * @param dia
 * @param mes
 * @param anio 
 */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
/**
 * 
 * @return Regresamos el dia ingresado
 */
    public int getDia() {
        return dia;
    }
/**
 * Recibimos un dia(debe ser postivo)
 * @param dia 
 */
    public void setDia(int dia) {
        this.dia = dia;
    }
/**
 * 
 * @return Regresamos el mes ingresado
 */
    public int getMes() {
        return mes;
    }
/**
 * Recibimos 2 digitos para el mes
 * @param mes 
 */
    public void setMes(int mes) {
        this.mes = mes;
    }
/**
 * 
 * @return Regresamos el año ingresado
 */
    public int getAnio() {
        return anio;
    }
/**
 * Recibimos 4 digitos para el año 
 * @param anio 
 */
    public void setAnio(int anio) {
        this.anio = anio;
    }
/**
 * 
 * @return Los atributos de la Clase Fecha
 */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
}
