package model;

public class Poupanca implements Conta {

    private double saldo;
    
    @Override
    public double saldo() {
        return 0;
    }
    
    @Override
    public double sacar(double valor){
        saldo = saldo - valor;
        return saldo;
    }
    
    @Override
    public double depositar(double valor){
        saldo = saldo + valor;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
