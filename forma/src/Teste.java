import java.util.Random;

public class Teste {
    public static void main(String[] args) throws Exception {
        Forma forma[] = new Forma[5];
        Random v = new Random();

        for(int i = 0; i < 5; i ++, v = new Random()){
            int valor = v.nextInt();

            if (valor % 3 == 0) forma[i] = new Retangulo();
            if ((valor % 3 == 1) || (valor % 3 == -1)) forma[i] = new Quadrado();
            if((valor % 3 == 2) || (valor % 3 == -2)) forma[i]= new Circulo();
            forma[i].setDados();
        }

        for(int i = 0; i < 5; i ++){
            System.out.println("\nAltura = " + forma[i].getAltura() + "\nLargura = " + forma[i].getLargura() + "\nRaio = " + forma[i].getRaio());
        }

        for(int i = 0; i < 5; i ++){
            System.out.println("\nÁrea do " + forma[i].getFigura() + " = " + forma[i].calcularArea());
            System.out.println("\nPerímetro do " + forma[i].getFigura() + " = " + forma[i].calcularPerimetro()); 
        }
    }
}