package poo;


public class Conta {
    public Conta(int numero){
        // System.out.println("Criar");
        setNumero(numero);
        setLimite(1000);
    }
    // atributos => caracteristicas
    private int numero;
    private double saldo;
    private double limite;
    private String dono; 
    // comportamentos => metodos
    // tipo_retorno nome_metodo(parametros)
    String info(){
        String estado = "Numero: " + numero +
                        "\nSaldo: R$ " + saldo +
                        "\nDono: " + dono +
                        "\nLimite: " + limite ;
        return estado;                 
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    @Override
    public String toString(){
        return this.info();
    }
}
