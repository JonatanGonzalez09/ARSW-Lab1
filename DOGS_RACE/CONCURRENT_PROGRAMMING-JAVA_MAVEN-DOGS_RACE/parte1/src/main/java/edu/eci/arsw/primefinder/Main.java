package edu.eci.arsw.primefinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		PrimeFinderThread primHilo=new PrimeFinderThread(0, 10000000);
		PrimeFinderThread segHilo=new PrimeFinderThread(10000000, 20000000);
		PrimeFinderThread tercHilo=new PrimeFinderThread(20000000, 30000000);
		primHilo.start();
		segHilo.start();
		tercHilo.start();

		//Pausar los hilos despues de 5 segundos
		Thread.sleep(5000);
		primHilo.pausar();
		segHilo.pausar();
		tercHilo.pausar();
		System.out.println("Numero de primos encontrados del primer hilo: "+primHilo.getPrimes().size());
		System.out.println("Numero de primos encontrados del segundo hilo: "+segHilo.getPrimes().size());
		System.out.println("Numero de primos encontrados del tercer hilo: "+tercHilo.getPrimes().size());

		Scanner scan = new Scanner(System.in);
		System.out.print("Presione la tecla enter para continuar: ");
		scan.nextLine();
		scan.close();
		primHilo.reanudar();
		segHilo.reanudar();
		tercHilo.reanudar();
	}
}

