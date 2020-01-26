package edu.eci.arsw.math;

public class ThreadPi extends Thread {
	int start;
    int digitos;
    private byte[] digHex;

    ThreadPi(int start, int digitos){
        this.start = start;
        this.digitos = digitos;
    }

    @Override
    public void run() {
        long inicio = System.currentTimeMillis();
        System.out.println("Hilo Iniciado");
        System.out.println("start: "+this.start+" digitos: "+this.digitos);
        this.digHex = PiDigits.getDigits(start, digitos);
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo total: "+(fin-inicio));
    }

    public byte[] getLista(){
        return this.digHex;
    }

    public int getStart(){
        return this.start;
    }

    public void setStart(int start){
        this.start = start;
    }

    public int getDigitos(){
        return this.digitos;
    }

    public void setDigitos(int digitos){
        this.digitos = digitos;
    }
}
