package bancojuan;

public class ContadorJuan {
    
    private String nombre;
    private double saldo;
    private double monto;
    private double saldodespuesdelmonto;
    private double retiro;
    private double saldodespuesdelretiro;
    
    public ContadorJuan(String inputNombre, double inputSaldo, double inputMonto, double inputSaldodespuesdelmonto, double inputRetiro, double inputSaldodespuesdelretiro) {
        this.nombre = inputNombre;
        this.saldo = inputSaldo;
        this.monto = inputMonto;
        this.saldodespuesdelmonto = inputSaldodespuesdelmonto;
        this.retiro = inputRetiro;
        this.saldodespuesdelretiro = inputSaldodespuesdelretiro;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public double getMonto(){
        return this.monto;
    }
    
    public void setMonto(double newMonto){
        this.saldo = newMonto;
    }
    
    public void Saldodespuesdelmonto (double valorDelSaldoAnterior){
        saldodespuesdelmonto = saldo + valorDelSaldoAnterior;
    }
    
    public double getNuevoSaldo (){
        return this.saldodespuesdelmonto;
    }
    
    public double getRetiro(){
        return this.retiro;
    }
    
    public void setRetiro (double newRetiro){
        this.retiro = newRetiro;
    }
    
    public void Saldodespuesdelretiro (double valorDelRetiro){
        saldodespuesdelretiro = saldodespuesdelmonto - valorDelRetiro;
    }
    
    public double getSaldodespuesdelretiro (){
        return this.saldodespuesdelretiro;
    }
    
}