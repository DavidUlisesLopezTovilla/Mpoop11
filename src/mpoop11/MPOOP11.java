/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

/**
 *
 * @author HP
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        HiloThread hilo1 = new HiloThread("Primer hilo");
        hilo1.start();
        new HiloThread("Segundo Hilo").start();
        System.out.println("Termina el hilo principal ");
        
        new Thread(new HiloRunnable(),"Tercer hilo").start();
        new Thread(new HiloRunnable(),"Cuarto hilo").start();
        
        
    }
    
}
