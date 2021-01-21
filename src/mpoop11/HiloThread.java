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
public class HiloThread extends Thread{
    
    public HiloThread(String nombre){
    super(nombre);
    }
    
    @Override public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Interación " +i+ " de " +getName());
        }
        System.out.println("Termina el" +getName());
    }   
}
