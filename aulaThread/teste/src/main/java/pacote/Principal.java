package pacote;

public class Principal {

    public static void main(String[] args) {

        Contador c1 = new Contador();
     // Contador c2 = new Contador();

        Thread comHecanca = new Fluxo1(c1);
        Thread comInterface = new Thread(new Fluxo2(c1));

        // executando as threads
        comHecanca.start();
        comInterface.start();


        try{
            comHecanca.join();
            comInterface.join();
            System.err.println("Depois do join");
        } catch (InterruptedException e) {
            System.err.println(e.toString());
            e.printStackTrace();
        }


        System.err.println("Fim do programa");








    }
}
