package pacote;

import java.util.Random;

public class Contador {

    private int valorAtual;


    public Contador(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public Contador() {

    }

    public void incrementar(){
        this.valorAtual++;
    }

    Random r = new Random();

    public void incrementar(int i){
        int d = r.nextInt(4000) + 1000;
        try {
            Thread.sleep(d);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.valorAtual += i;
    }


    public int getValorAtual() {
        return valorAtual;
    }

}
