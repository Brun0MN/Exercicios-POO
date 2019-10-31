package pacote;

import java.util.Random;

public class Fluxo2 implements Runnable{

    private Contador cont;

    public Fluxo2(Contador cont) {
        this.cont = cont;
    }

    public void run(){
        Random r = new Random();

        for(int i=0; i<10;i++){
            System.err.println("fluxo2 " + this.cont.getValorAtual());
            try {
                int d = r.nextInt(4000) + 1000;
                Thread.sleep(d);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.cont.incrementar();

            System.err.println("fluxo2 " + this.cont.getValorAtual());
        }
    }



}
