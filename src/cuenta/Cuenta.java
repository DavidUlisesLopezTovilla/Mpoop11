/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author HP
 */
public class Cuenta extends Thread{
	public static long saldo=0;
	
	public Cuenta (String nombre) {
		super(nombre);
	}
	
	public static void main (String[] args){
	    new Cuenta("Acesso 1").start();
	    new Cuenta("Acesso 2").start();
	    new Cuenta("Deposito 1").start();
	    new Cuenta("Deposito 2").start();
	    System.out.println("Termina el hilo principal");
	}
}
