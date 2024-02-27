/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.escuelaa;

/**
 *
 * @author FER
 */
import javax.swing.JOptionPane;
public class operaciones {
   //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    //Metodos
    
    public void leerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("coloca el num 1"));
         numero2=Integer.parseInt(JOptionPane.showInputDialog("coloca el num 2"));
         
    }
    //Metodo de suma
    public void sumar(){
        suma=numero1+numero2;
    }
    public void resta(){
        resta=numero1-numero2;
    }
     public void multiplicacion(){
        multiplicacion=numero1*numero2;
    }
     public void division(){
        division=numero1/numero2;
    }
     public void mostrarResultados(){
         System.out.println("la suma es:"+suma);
         System.out.println("la resta es:"+resta);
         System.out.println("la multiplicaciion es:"+multiplicacion);
         System.out.println("la division es:"+division);
     }
    }
            


