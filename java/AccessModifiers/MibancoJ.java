package mibancoj;

public class MibancoJ {
    private Micontadorj contador1;
    private Micontadorj contador2;
    
    public MibancoJ (){
        contador1 = new Micontadorj ("Zeuz",100,"1");
        contador2 = new Micontadorj ("Hades",200,"2");
    }
    
    public static void main(String[] args) {
        MibancoJ bancoHermoso = new MibancoJ();
        System.out.println(bancoHermoso.contador1.getBalance());
        bancoHermoso.contador1.setBalance(5000);
        System.out.println(bancoHermoso.contador1.getBalance());
        System.out.println(bancoHermoso.contador1.getInteres());
        bancoHermoso.contador1.consignar(1000);
        System.out.println(bancoHermoso.contador1.getBalance());
    
    }
    
}
