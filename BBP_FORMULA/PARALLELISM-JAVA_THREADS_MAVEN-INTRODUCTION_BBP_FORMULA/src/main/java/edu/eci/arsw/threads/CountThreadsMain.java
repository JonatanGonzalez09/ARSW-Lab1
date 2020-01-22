/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;


/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]) throws InterruptedException{
    	
    	CountThread FirstH=new CountThread("Primer Hilo",0,99);
    	Thread primerHilo=new Thread(FirstH);
    	primerHilo.run();
    	
    	CountThread SecondH=new CountThread("Segundo Hilo",99,199);
    	Thread segundoHilo=new Thread(SecondH);
    	segundoHilo.run();
    	
    	CountThread ThirdH=new CountThread("Tercer Hilo",200,299);
    	Thread tercerHilo=new Thread(ThirdH);
    	tercerHilo.run();
    	
    	//Cuando se ejecuta con start(), se corren los 3 hilos a la vez. 
    	//Cuando se ejecuta con run(), se corren los 3 hilos por bloques, primero ejecuta el primero hasta finzalizar, luego el segundo hasta finalizar,
    	// y finalmente ejecuta el 3 hasta que lo finzalice.
    }
}
