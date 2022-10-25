public class Quadrado extends Retangulo {
    public Quadrado(){
        setFigura("Quadrado");
        super.setAltura(super.getLargura());
    }
    public float calcularArea() {
        
        return getLargura() * getLargura();
    }

    public float calcularPerimetro() {
        return 4 * getLargura();

    }
}
