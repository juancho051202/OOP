package bancojuan;

public class BancoJuan {
    private ContadorJuan contador1;
    private ContadorJuan contador2;
    
    public BancoJuan() {
        contador1 = new ContadorJuan ("Cuenta Emma",0,0,0,0,0);
        contador2 = new ContadorJuan ("Cuenta Jaco",0,0,0,0,0);
    }
    
    public static void main(String[] args) {
        BancoJuan MejorBanco = new BancoJuan();
        System.out.println("Cuenta de Emma");
        System.out.println("Tu saldo inicial es:");
        System.out.println(MejorBanco.contador1.getSaldo());
        
        System.out.println("Tu primer monto es:");
        MejorBanco.contador1.setMonto(50000);
        System.out.println(MejorBanco.contador1.getSaldo());
        System.out.println("Tu saldo luego del primer monto es:");
        MejorBanco.contador1.Saldodespuesdelmonto(0);
        System.out.println(MejorBanco.contador1.getNuevoSaldo());
        System.out.println("Tu primer retiro es:");
        MejorBanco.contador1.setRetiro(5000);
        System.out.println(MejorBanco.contador1.getRetiro());
        System.out.println("Tu saldo luego del primer retiro es:");
        MejorBanco.contador1.Saldodespuesdelretiro(5000);
        System.out.println(MejorBanco.contador1.getSaldodespuesdelretiro());
        
        
        System.out.println("Tu segundo monto es:");
        MejorBanco.contador1.setMonto(100000);
        System.out.println(MejorBanco.contador1.getSaldo());
        System.out.println("Tu saldo luego del segundo monto es:");
        MejorBanco.contador1.Saldodespuesdelmonto(45000);
        System.out.println(MejorBanco.contador1.getNuevoSaldo());
        System.out.println("Tu segundo retiro es:");
        MejorBanco.contador1.setRetiro(5000);
        System.out.println(MejorBanco.contador1.getRetiro());
        System.out.println("Tu saldo luego del segundo retiro es:");
        MejorBanco.contador1.Saldodespuesdelretiro(5000);
        System.out.println(MejorBanco.contador1.getSaldodespuesdelretiro());
        
        System.out.println("Tu tercer monto es:");
        MejorBanco.contador1.setMonto(50000);
        System.out.println(MejorBanco.contador1.getSaldo());
        System.out.println("Tu saldo luego del tercer monto es:");
        MejorBanco.contador1.Saldodespuesdelmonto(140000);
        System.out.println(MejorBanco.contador1.getNuevoSaldo());
        System.out.println("Tu tercer retiro es:");
        MejorBanco.contador1.setRetiro(5000);
        System.out.println(MejorBanco.contador1.getRetiro());
        System.out.println("Tu saldo luego del tercer retiro es:");
        MejorBanco.contador1.Saldodespuesdelretiro(5000);
        System.out.println(MejorBanco.contador1.getSaldodespuesdelretiro());
        
        System.out.println("Tu cuarto monto es:");
        MejorBanco.contador1.setMonto(100000);
        System.out.println(MejorBanco.contador1.getSaldo());
        System.out.println("Tu saldo luego del cuarto monto es:");
        MejorBanco.contador1.Saldodespuesdelmonto(185000);
        System.out.println(MejorBanco.contador1.getNuevoSaldo());
        System.out.println("Tu cuarto retiro es:");
        MejorBanco.contador1.setRetiro(5000);
        System.out.println(MejorBanco.contador1.getRetiro());
        System.out.println("Tu saldo luego del cuarto retiro es:");
        MejorBanco.contador1.Saldodespuesdelretiro(5000);
        System.out.println(MejorBanco.contador1.getSaldodespuesdelretiro());
        
        System.out.println("Tu quinto monto es:");
        MejorBanco.contador1.setMonto(100000);
        System.out.println(MejorBanco.contador1.getSaldo());
        System.out.println("Tu saldo luego del quinto monto es:");
        MejorBanco.contador1.Saldodespuesdelmonto(280000);
        System.out.println(MejorBanco.contador1.getNuevoSaldo());
        System.out.println("Tu quinto retiro es:");
        MejorBanco.contador1.setRetiro(5000);
        System.out.println(MejorBanco.contador1.getRetiro());
        System.out.println("Tu saldo luego del quinto retiro es:");
        MejorBanco.contador1.Saldodespuesdelretiro(5000);
        System.out.println(MejorBanco.contador1.getSaldodespuesdelretiro());
        
        System.out.println("////////////////////////////////////////////////////");
        
        System.out.println("Cuenta de Jaco");
        System.out.println("Tu saldo inicial es:");
        System.out.println(MejorBanco.contador2.getSaldo());
        
        System.out.println("Tu primer monto es:");
        MejorBanco.contador2.setMonto(100000);
        System.out.println(MejorBanco.contador2.getSaldo());
        System.out.println("Tu saldo luego del primer monto es:");
        MejorBanco.contador2.Saldodespuesdelmonto(0);
        System.out.println(MejorBanco.contador2.getNuevoSaldo());
        System.out.println("Tu primer retiro es:");
        MejorBanco.contador2.setRetiro(10000);
        System.out.println(MejorBanco.contador2.getRetiro());
        System.out.println("Tu saldo luego del primer retiro es:");
        MejorBanco.contador2.Saldodespuesdelretiro(10000);
        System.out.println(MejorBanco.contador2.getSaldodespuesdelretiro());
        
        
        System.out.println("Tu segundo monto es:");
        MejorBanco.contador2.setMonto(100000);
        System.out.println(MejorBanco.contador2.getSaldo());
        System.out.println("Tu saldo luego del segundo monto es:");
        MejorBanco.contador2.Saldodespuesdelmonto(90000);
        System.out.println(MejorBanco.contador2.getNuevoSaldo());
        System.out.println("Tu segundo retiro es:");
        MejorBanco.contador2.setRetiro(10000);
        System.out.println(MejorBanco.contador2.getRetiro());
        System.out.println("Tu saldo luego del segundo retiro es:");
        MejorBanco.contador2.Saldodespuesdelretiro(10000);
        System.out.println(MejorBanco.contador2.getSaldodespuesdelretiro());
        
        System.out.println("Tu tercer monto es:");
        MejorBanco.contador2.setMonto(100000);
        System.out.println(MejorBanco.contador2.getSaldo());
        System.out.println("Tu saldo luego del tercer monto es:");
        MejorBanco.contador2.Saldodespuesdelmonto(180000);
        System.out.println(MejorBanco.contador2.getNuevoSaldo());
        System.out.println("Tu tercer retiro es:");
        MejorBanco.contador2.setRetiro(10000);
        System.out.println(MejorBanco.contador2.getRetiro());
        System.out.println("Tu saldo luego del tercer retiro es:");
        MejorBanco.contador2.Saldodespuesdelretiro(10000);
        System.out.println(MejorBanco.contador2.getSaldodespuesdelretiro());
        
        System.out.println("Tu cuarto monto es:");
        MejorBanco.contador2.setMonto(100000);
        System.out.println(MejorBanco.contador2.getSaldo());
        System.out.println("Tu saldo luego del cuarto monto es:");
        MejorBanco.contador2.Saldodespuesdelmonto(270000);
        System.out.println(MejorBanco.contador2.getNuevoSaldo());
        System.out.println("Tu cuarto retiro es:");
        MejorBanco.contador2.setRetiro(10000);
        System.out.println(MejorBanco.contador2.getRetiro());
        System.out.println("Tu saldo luego del cuarto retiro es:");
        MejorBanco.contador2.Saldodespuesdelretiro(10000);
        System.out.println(MejorBanco.contador2.getSaldodespuesdelretiro());
        
        System.out.println("Tu quinto monto es:");
        MejorBanco.contador2.setMonto(100000);
        System.out.println(MejorBanco.contador2.getSaldo());
        System.out.println("Tu saldo luego del quinto monto es:");
        MejorBanco.contador2.Saldodespuesdelmonto(360000);
        System.out.println(MejorBanco.contador2.getNuevoSaldo());
        System.out.println("Tu quinto retiro es:");
        MejorBanco.contador2.setRetiro(10000);
        System.out.println(MejorBanco.contador2.getRetiro());
        System.out.println("Tu saldo luego del quinto retiro es:");
        MejorBanco.contador2.Saldodespuesdelretiro(10000);
        System.out.println(MejorBanco.contador2.getSaldodespuesdelretiro());
    }
    
}