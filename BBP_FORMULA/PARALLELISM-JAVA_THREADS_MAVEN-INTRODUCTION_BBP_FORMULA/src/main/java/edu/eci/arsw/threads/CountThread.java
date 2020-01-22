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
public class CountThread extends Thread {
    String hilo;
    int a,b;

    CountThread(String nombreHilo,int a, int b){
        hilo = nombreHilo;
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        System.out.println(hilo+" Iniciado");
        for (int count=a; count<b+1; count++){
            try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
            System.out.println("En "+hilo+" "+count);
        }
        System.out.println(hilo+" Finalizado");
    }

        
}
