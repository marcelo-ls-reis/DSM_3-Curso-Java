
public class Circulo extends Forma {

    public float calcularArea(){
        return (float)Math.PI * (float)Math.pow(raio, 2); 
   }

   public float calcularPerimetro(){
       return 2 * (float)Math.PI * raio;
   }
}
