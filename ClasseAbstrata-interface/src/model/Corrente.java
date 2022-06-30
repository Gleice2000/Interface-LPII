package model;

public class Corrente implements Conta {

    private double saldo;
    private double limite;

    @Override
    public double saldo() {
        return 0;
    }

    public double limite() {
        return 0;
    }

    @Override
    public double sacar(double valor) {
        saldo = saldo - valor;
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo = saldo + valor;
        return saldo;
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
    
}
