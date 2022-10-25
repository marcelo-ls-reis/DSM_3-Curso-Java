import java.util.*;

public abstract class Forma { 

    String figura;
    float altura;
    float largura;
    float raio;

    public abstract float calcularArea();
    public abstract float calcularPerimetro();

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getLargura() {
        return largura;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public void setFigura(String fig){
        figura = fig;
    }
    public String getFigura(){
        return figura;
    }
    public void setDados(){
    Random Valor = new Random();{
        raio = Valor.nextInt(50);
        largura = Valor.nextInt(50);
        altura = Valor.nextInt(50);
    }
    }
}
