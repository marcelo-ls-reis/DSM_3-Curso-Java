
public class Circulo extends Forma {
    public Circulo(){
        setFigura("Circulo");
    }

    public float calcularArea(){
        return (float)Math.PI * (float)Math.pow(getRaio(), 2); 
   }

   public float calcularPerimetro(){
       return 2 * (float)Math.PI * getRaio();
   }
}
