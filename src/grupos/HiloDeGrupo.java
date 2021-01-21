/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

/**
 *
 * @author HP
 */
public class HiloDeGrupo extends Thread {

    public HiloDeGrupo(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("Interación " +i+ " de " + Thread.currentThread().getName());
    }   
}
}
