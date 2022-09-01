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

        Conta objCP = new Conta(231);
        objCP.setNumero(231);
        objCP.setSaldo(2000);
        objCP.setDono("Fernando");

        Conta objCV = new Conta(245);
        objCV.setNumero(245);
        objCV.setSaldo(2000);
        objCV.setDono("Roberto");

        System.out.println(objCC.info());
        System.out.println("----------------------");
        System.out.println(objCP.info());
        System.out.println("----------------------");
        System.out.println(objCV.info());
        // JOptionPane.showMessageDialog(null, objCP.info());
        // JOptionPane.showMessageDialog(null, objCC.info());
        // JOptionPane.showMessageDialog(null, objCV.info());

        // System.out.println("------REFERENCIA------");
        // System.out.println(objCC);
        // System.out.println(objCP);
        // System.out.println(objCV);
    }
}
