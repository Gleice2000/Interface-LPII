package model;

public interface Conta {

    public static double LIMITE_PADRAO = 100; //=double LIMITE_PADRAO = 100;

    double saldo();
    double sacar(double valor);
    double depositar(double valor);

    static String limitePadraoFormatado() {
        String valorFormatado = String.format("%.2f", LIMITE_PADRAO);
        return valorFormatado;
    }

    default String limiteFormatado() {
        return limitePadraoFormatado();
    }

}
