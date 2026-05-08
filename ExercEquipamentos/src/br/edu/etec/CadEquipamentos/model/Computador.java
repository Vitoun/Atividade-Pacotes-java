/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.CadEquipamentos.model;

/**
 *
 * @author Admin
 */
public class Computador extends Equipamento{
    
    
    
    public String getProcessador(){
        return processador;
    }
    
    public void setProcessador(String processador){
        this.processador = processador;
    }
    
    private String processador;
    
    public Computador (String nome, String modelo, String processador){
            super(nome, modelo);
            this.processador = processador;
    }
     
        
    }
    

