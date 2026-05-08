/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.ExercCarros.model;

/**
 *
 * @author Admin
 */
public class Carro {
     private String modelo;
     private String marca;
     private int valor;
    
     public String getmodelo(){
         return modelo;
     }
     
     public String getmarca(){
         return marca;
     }
     
     public double getvalor(){
         return valor;
     }
     
     public void setmodelo(String modelo){
         
         this.modelo = modelo;
         
     }
     public void setmarca(String marca){
         
         this.marca = marca;
         
     }
     public void setvalor (int valor){
         
         this.valor = valor;
         
     }
     
     
    
    public void InfoCarro(){
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("marca do carro: " + marca);
        System.out.println("preço do carro: R$" + valor);
        
    }
}
