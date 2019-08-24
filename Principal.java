public class Principal{
 
   public static void main(String[] args) {  //atalho: main
       System.out.println("Olá mundo");
 
       Carro fusca = new Carro();
 
       Carro ferrari = new Carro();
 
       fusca.definirVelocidade(80);
       ferrari.definirVelocidade(100);
 
       System.out.println("Velocidade do fusca: " + fusca.obterVelocidade());
       System.out.println("Velocidade da ferrari: " + ferrari.obterVelocidade());
 
       fusca.acelerar(10);
       System.out.println("Velocidade do fusca: " + fusca.obterVelocidade());
 
 
 
 
   }
 
 
}


