/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop5;
import java.util.Scanner;

/**
 *
 * @author jimen
 */
public class Main {
    public static void main(String[] args) {
       System.out.println("####################Getters y Setters ################");
        //Getters y Setters
        /**
         * Aqui creamos un Objeto de Clase Circulo
         */
        Circulo cir=new Circulo();
        System.out.println(cir);
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de Cir :"+cir.getRadio());
        cir.setRadio(7.2f);//castear de double a float
        
        cir.setRadio(-7);
        System.out.println(cir);
       //Conmposicion
       System.out.println("####################Composicion1############");
      /**
       * Aqui creamos un objeto de Clase Persona
       */
       Persona persona= new Persona();
       persona.setNombre("Mauricio");
       persona.setApellido("Jimenez");
       Fecha fNac=new Fecha(14,10,2021);
       persona.setfNacimiento(fNac);
       System.out.println(persona);
       System.out.println("####################Composicion2#############");
       
       Fecha fNac2= new Fecha(25,10,1999);
       Persona persona2=new Persona("Paula","Jimenez",fNac2);
       System.out.println(persona2);
       System.out.println("####################Composicion3#############");
       
       Persona persona3= new Persona("Liliana","Fuentes",22,4,1988);
        System.out.println(persona3);
       System.out.println("####################Composicion3#############");
       
       /**
        * Aqui creamos un objeto de la Clase Carro
        */
       System.out.println("**** Composición Coche ****");
        Persona pasajero1 = new Persona("Roberto","Salas",03,10,1987);
        System.out.println(pasajero1);
        Persona pasajero2 = new Persona("George","Rosas",24,06,1976);
        System.out.println(pasajero2);
        Persona pasajero3 = new Persona("Karla","Vengoa",15,07,1995);
        System.out.println(pasajero3);
        Persona pasajero4 = new Persona("Dalia","Salas",04,12,1990);
        System.out.println(pasajero4);
        Carro carro=new Carro("Tsuru","Nissan","Azul",2002,2500,true,pasajero1,pasajero2,pasajero3,pasajero4);
        Scanner scanner = new Scanner(System.in); 
	int op = 0;
	while(op != 5){
            System.out.println("~ Menú ~");
            System.out.println("1) Piloto/Chofer");
            System.out.println("2) Copiloto");
            System.out.println("3) pasajero 1");
            System.out.println("4) Pasajero 2");
            System.out.println("5) Salir");
            System.out.println("Elija la posición que desea conocer: ");
            op = Integer.parseInt(scanner.nextLine()); 
            switch(op){
                case 1: 
                    System.out.println("El piloto del vehiculo es"+carro.getPiloto());
                    break;
		case 2: 
                    System.out.println("El copiloto del vehiculo es"+carro.getCopiloto());
                    break;
		case 3: 
                    System.out.println("El pasajero 1 del vehiculo es"+carro.getPasajero1());
                    break;
                case 4: 
                    System.out.println("El pasajero 2 del vehiculo es"+carro.getPasajero2());
                    break;
                case 5: 
                    System.out.println("Hasta pronto");
                    break;
                default:
			System.out.println("Opción no válida");
                        break;
            }
        }
        System.out.println(carro.toString());
    }
}

