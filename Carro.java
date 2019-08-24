public class Carro{
   //atributos
   private double velocidade;
   private String marca;
 
   //métodos
 
   public void acelerar(double incremento){
       this.velocidade = this.velocidade + incremento;
   }
   public void definirVelocidade(double vel){
       this.velocidade = vel;
   }
  
   public void frear(double decremento){
       this.velocidade = this.velocidade - decremento;
   }
 
   public void mudarMarca(double nova){
       this.nova = nova;
   }
 
   public void imprimirMarca(){
       System.out.println(this.marca);
   }
 
   public String mobterMarca(){
       return this.marca;
   }
 
   public double obterVelocidade(){
       return this.velocidade;
   }
}


