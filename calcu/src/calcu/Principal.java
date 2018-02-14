package micalculadora;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
   public static void main(String[] args){
       
      //  crear objeto de la clase Calculadora
      
    Calculadora  miCalculadora; //definicion
    
    miCalculadora=new Calculadora(); //construir el objeto
   
   
   Scanner miEscaner;
   
   miEscaner=new Scanner(System.in);
   
   
 int opcion;

System.out.println( "ingrese el numero de la operacion");
System.out.println( "a.sumar");
System.out.println( "b.restar");
System.out.println( "c.multiplicar");
System.out.println( "d.coseno");


 opcion = miEscaner.nextInt();
   miCalculadora.setX(opcion)
   
  entrada=miEscaner.nextInt();
  miCalculadora.setY(opcion); 
   
  
  
              
  int entrada;
  entrada=miEscaner.nextInt();
  miCalculadora.setX(entrada);
  
  
  entrada=miEscaner.nextInt();
  miCalculadora.setY(entrada);
  
   miCalculadora.sumar();
   
   
   System.out.println(  miCalculadora.getR());
  
  
   
   
   }
}