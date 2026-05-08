
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.ExercCarros.teste;
import br.edu.etec.ExercCarros.model.Carro;
/**
 *
 * @author Admin
 */

public class TesteCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Carro c1 = new Carro();        
       
       c1.setmodelo("Corolla GLi 2.0 CVT");
       c1.setmarca("Toyota");
       c1.setvalor(158990);
       
       c1.InfoCarro();
    }
    
}
