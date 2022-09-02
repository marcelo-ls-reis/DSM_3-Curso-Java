package poo;

// import javax.swing.JOptionPane;

public class TesteConta {

    public TesteConta() {
    }

    
    
    public static void main(String[] args){
        Conta objCC = new Conta(123);
        objCC.setNumero (123);
        objCC.setSaldo (2000);
        objCC.setDono ("Marcelo");

        Conta objDP = new Conta(123); 
        objDP.setNumero (123);
        objDP.setSaldo (2000);        
        objDP.setDeposito(1000);

        Conta objSQ = new Conta(123);
        objSQ.setNumero (123);
        objSQ.setSaldo (3000);  
        objSQ.setSaque(4000);

        // Conta objCP = new Conta(231);
        // objCP.setNumero(231);
        // objCP.setSaldo(2000);
        // objCP.setDono("Fernando");
        // objCP.setSaque(3000);

        // Conta objCV = new Conta(245);
        // objCV.setNumero(245);
        // objCV.setSaldo(2000);
        // objCV.setDono("Roberto");
        // objCV.setSaque(500);

        System.out.println(objCC.info());
        System.out.println("----------------------");
        System.out.println(objDP.dep());
        System.out.println("----------------------");
        System.out.println("Saldo: " + objDP.saldo);
        System.out.println("----------------------");
        System.out.println(objSQ.saq());
        System.out.println("----------------------");
        System.out.println("Saldo: " + objSQ.saldo);
        System.out.println("----------------------");
        // System.out.println(objCP.info());
        // System.out.println("----------------------");
        // System.out.println(objCV.info());
        // JOptionPane.showMessageDialog(null, objCP.info());
        // JOptionPane.showMessageDialog(null, objCC.info());
        // JOptionPane.showMessageDialog(null, objCV.info());

        // System.out.println("------REFERENCIA------");
        // System.out.println(objCC);
        // System.out.println(objCP);
        // System.out.println(objCV);
    }
}
