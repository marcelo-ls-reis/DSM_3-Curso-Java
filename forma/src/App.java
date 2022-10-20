public class App {
    public static void main(String[] args) throws Exception {
        Retangulo retangulo = new Retangulo();
        retangulo.altura = 10;
        retangulo.largura = 10;

        retangulo.calculaArea();
        
        retangulo.altura = 10;
        retangulo.largura = 10;

        retangulo.calculaPerimetro();
    }
}