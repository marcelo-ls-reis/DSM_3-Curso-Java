import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Forma forma[] = new Forma[5];
        Random v = new Random();

        for(int i = 0; i < 5; i ++, v = new Random()){
            int valor = v.nextInt();

            if (valor % 3 == 0) forma[i] = new Retangulo();
            if ((valor % 3 == 1) || (valor % 3 == -1)) forma[i] = new Circulo();
            if((valor % 3 == 2) || (valor % 3 == -2)) forma[i]= new Quadrado();
            forma[i].setDados();
        }

        for(int i = 0; i < 5; i ++){
            System.out.println(forma[i].getFigura() + forma[i].calcularArea());
            System.out.println(forma[i].getFigura() + forma[i].calcularPerimetro()); 
        }
    //     Retangulo retangulo = new Retangulo();
        
    //     System.out.println("*********************************************");
    //     System.out.println("Altura = " + retangulo.getAltura());
    //     System.out.println("Largura = " + retangulo.getLargura());
    //     System.out.println("Área do Retangulo = " + retangulo.calcularArea());
    //     System.out.println("Perímetro do Retangulo = " + retangulo.calcularPerimetro());
    
    //     Circulo circulo = new Circulo();
        
    //     System.out.println("*********************************************");
    //     System.out.println("Raio = " + circulo.getRaio() );
    //     System.out.println("Área do Circulo = " + circulo.calcularArea());
    //     System.out.println("Perímetro do Circulo = " + circulo.calcularPerimetro());

    //     Quadrado quadrado = new Quadrado();
        
    //     System.out.println("*********************************************");
    //     System.out.println("Largura = " + quadrado.getLargura());
    //     System.out.println("Área do Quadrado = " + quadrado.calcularArea());
    //     System.out.println("Perímetro do quadrado = " + quadrado.calcularPerimetro());
    //     System.out.println("*********************************************");
    
    }
}