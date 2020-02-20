package dev.arantes.education.listasmodular.lista1.EX3;
public class Conta {
    private int num;
    private int saldo;

    public Conta(int num, int saldo) {
        this.num = num;
        this.saldo = saldo;
    }

    public Conta(int num) {
        this.num = num;
        this.saldo = 0;
    }

    public void depositar(int quantia) {
        this.saldo += quantia;
    }

    public boolean sacar(int quantia) {
        if (possuiSaldo(quantia)) {
            this.saldo -= quantia;
            return true;
        }

        return false;
    }

    public boolean possuiSaldo(int value) {
        return (saldo - value) >= 0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}