import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 11;
        retangulo.largura = 10;

        System.out.println("Área do Retangulo = " + retangulo.calcularArea());
        
        retangulo.altura = 10;
        retangulo.largura = 10;

        System.out.println("Perímetro do Retangulo = " + retangulo.calcularPerimetro());
        Circulo circulo = new Circulo();
        Random Valor = new Random();
        circulo.raio = Valor.nextInt(50);
        System.out.println("Raio = " + circulo.raio);
        System.out.println("Área do Circulo = " + circulo.calcularArea());
        System.out.println("Perímetro do Circulo = " + circulo.calcularPerimetro());
         
    }
}