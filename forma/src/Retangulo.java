public class Retangulo extends Forma {

    public float calcularArea(){
        return getAltura() * getLargura();
    }
     
     public float calcularPerimetro(){
         return (getAltura() + getLargura()) * 2;
     }
          
}
