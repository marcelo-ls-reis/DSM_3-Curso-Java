public class Retangulo extends Forma {

    public void calculaArea(){
        if (altura == largura){
            System.out.println("Quadrado");
        }
        else{
            System.out.println("Retangulo");       
        }
        System.out.println("Área: " + altura * largura + " metros");
     }
 
     public void calculaPerimetro(){
         System.out.println("Perímetro: " + (altura + largura) * 2 + " metros");
     }
          
}
