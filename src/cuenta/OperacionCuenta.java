/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import static cuenta.Cuenta.saldo;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class OperacionCuenta extends Cuenta{

    public OperacionCuenta(String nombre) {
        super(nombre);
    }
    @Override
    public void run(){
	    if(getName().equals("Deposito 1")||getName().equals("Deposito 2")){
	       this.depositarDinero(100);       
	    }else{
                try {
                    this.extraerDinero(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(OperacionCuenta.class.getName()).log(Level.SEVERE, null, ex);
                }
	    }
	    System.out.println("Termina el "+getName());
	}
	public synchronized void depositarDinero(int cantifad){
        String cantidad = null;
	    System.out.println("Se depositaron "+cantidad+"pesos");
	    notifyALL();
	}
	
	public synchronized void extraerDinero(int cantidad) throws InterruptedException{
            if (saldo<=0){
                System.out.println(gatName()+" espera deposito"+"\nSaldo="+saldo);
                sleep(5000);
            }
	    saldo -= cantidad;
	    System.out.println(getName()+ "extrajo"+ cantidad + " pesos.\nSaldo restante =" + saldo);
	    notifyAll();
	}

    private String gatName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void notifyALL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
