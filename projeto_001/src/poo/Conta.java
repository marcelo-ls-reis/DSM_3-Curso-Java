package poo;


public class Conta {
    public Conta(int numero){
        // System.out.println("Criar");
        setNumero(numero);
        setLimite(1000);
        setDeposito(deposito);
        setSaldo(saldo);
    }
    // atributos => caracteristicas
    private int numero;
    private double saldo;
    private double limite;
    private String dono;
    private double deposito;
    private double saque; 
    // comportamentos => metodos
    // tipo_retorno nome_metodo(parametros)
    String info(){
        String estado = "Numero: " + numero +
                        "\nSaldo: R$ " + saldo +
                        "\nDono: " + dono +
                        "\nLimite: " + limite +
                        "\nDeposito: " + deposito +
                        "\nSaque: " + saque ;
        return estado;                 
    }
    public double setDeposito(double deposito) {
        this.saldo = saldo + deposito;
        return this.deposito = deposito;
    }
    public double setSaque(double saque) {
        if (saldo < saque) {
            System.out.println("Saldo Insuficiente");    
        } else {
            this.saldo = saldo - saque;
        }
        return this.saque = saque;
    } 
    public double getDeposito() {
        return deposito;
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
