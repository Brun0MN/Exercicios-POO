package pacote;

import java.util.Random;

public class Fluxo1 extends Thread {
    private Contador cont;


    public Fluxo1(Contador cont) {
        this.cont = cont;
    }

    public void run(){
        Random r = new Random();



        for(int i=0; i<10;i++){
            int cAtual = cont.getValorAtual();
            System.err.println("fluxo1 " + cAtual);
            int f = r.nextInt(1000);
            try {
                Thread.sleep(f);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            cont.incrementar(cAtual + 1);
            System.err.println("fluxo1 " + this.cont.getValorAtual());
        System.err.println("fluxo1 " + this.cont.getValorAtual() + " a: f1: 10");
        try {
            int d = r.nextInt(1000);
            Thread.sleep(d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.cont.incrementar();

        System.err.println("fluxo1 " + this.cont.getValorAtual() + " d: f1: 11");
    }
 }



}
