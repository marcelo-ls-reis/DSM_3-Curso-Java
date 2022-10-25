public class Retangulo extends Forma {
    public Retangulo(){
        setFigura("Retangulo");
    }

    public float calcularArea(){
        return getAltura() * getLargura();
    }
     
     public float calcularPerimetro(){
         return (getAltura() + getLargura()) * 2;
     }
          
}
