/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Salas
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reloj reloj = new Reloj (12,59,59);
        
        reloj.setHora(14);
        
        System.out.println(reloj.mostrarTiempo24Horas());
        
        
           
    }
    
}
