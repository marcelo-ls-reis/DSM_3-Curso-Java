
public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 11;
        retangulo.largura = 10;

        retangulo.calculaArea();
        
        retangulo.altura = 10;
        retangulo.largura = 10;

        retangulo.calculaPerimetro();

        Circulo circulo = new Circulo();
        circulo.raio = 15;
        circulo.area();
    }
}