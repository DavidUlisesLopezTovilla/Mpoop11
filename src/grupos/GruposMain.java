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
public class GruposMain {
    public static void main(String[] args) {
        ThreadGroup grupoHilos = new ThreadGroup("Grupo de Hilos");
        Thread hilo1 = new HiloDeGrupo(grupoHilos,"Hilo 1 con prioridad normal");
        Thread hilo2 = new HiloDeGrupo(grupoHilos,"Hilo 2 con prioridad normal");
        Thread hilo3 = new HiloDeGrupo(grupoHilos,"Hilo 3 con prioridad máxima");
        Thread hilo4 = new HiloDeGrupo(grupoHilos,"Hilo 4 con prioridad normal");
        Thread hilo5 = new HiloDeGrupo(grupoHilos,"Hilo 5 con prioridad normal");
        
        hilo3.setPriority(Thread.MAX_PRIORITY);
        grupoHilos.setMaxPriority(Thread.NORM_PRIORITY);
     
        System.out.println("Prioridad del Hilo 1: " +hilo1.getPriority());
        System.out.println("Prioridad del Hilo 2: " +hilo2.getPriority());
        System.out.println("Prioridad del Hilo 3: " +hilo3.getPriority());
        System.out.println("Prioridad del Hilo 4: " +hilo4.getPriority());
        System.out.println("Prioridad del Hilo 5: " +hilo5.getPriority());
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        
        listarHilos(grupoHilos);
        
    }

    private static void listarHilos(ThreadGroup grupoHilos) {
        int numHilos;
        Thread[] listaDeHilos;
        
        numHilos = grupoHilos.activeCount();
        listaDeHilos = new Thread[numHilos];
        
        grupoHilos.enumerate(listaDeHilos);
        System.out.println("El numero de hilos activos es: "+numHilos);
        for (int i = 0; i <numHilos; i++){
            System.out.println("Soy el Hilo "+listaDeHilos[i].getName()+ " en pos "+i);
        }
    }
}
