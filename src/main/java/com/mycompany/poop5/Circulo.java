/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;

/**
 *
 * @author jimen
 */
public class Circulo {
    //encapsulamiento
    private float radio;

    public Circulo() {
    }
    //getters y setter
    /**
     * 
     * @return Radio del Circulo
     */
    public float getRadio(){
        return radio;
    }
    /**
     * Recibimos el radio del Circulo
     * @param radio 
     */
    public void setRadio(float radio){
        if(radio<0){
            this.radio=Math.abs(radio);
        }else{
            this.radio=radio;
        }
        
    }
    //atributos
    /**
     * Calculamos el perimetro del Circulo
     * @return  El perimetro
     */
    public float perimetro(){
        return 2*(float)Math.PI*radio;
    }
    /**
     * Calculamos la area del Circulo
     * @return El area
     */
    public float area(){
        return (float)Math.PI*(float)Math.pow(radio, 2);
    }
    /**
    * Imprimimos todo los atributos  que tenga el Circulo
    * @return El radio del Circulo
    */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
    
}
