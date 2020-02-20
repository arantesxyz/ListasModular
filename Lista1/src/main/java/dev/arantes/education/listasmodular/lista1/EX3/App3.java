package dev.arantes.education.listasmodular.lista1.EX3;

import java.util.Scanner;

public class App3 implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número da sua conta: ");
        Conta conta = new Conta(sc.nextInt());

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("Deposito - [1]");
            System.out.println("Saque - [2]");
            System.out.println("Saldo - [3]");

            switch (sc.nextInt()){
                case 1:
                    System.out.print("Informe o valor a ser depositado: ");
                    conta.depositar(sc.nextInt());
                    System.out.println("Seu novo saldo é: " + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Informe o valor para sacar: ");
                    if (conta.sacar(sc.nextInt())){
                        System.out.println("Seu novo saldo é: " + conta.getSaldo());
                    }else{
                        System.out.println("Você não possui saldo suficiente para sacar!");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é: " + conta.getSaldo());
                    break;
            }

            System.out.println("Deseja sair?( Sim[1] - Não[2] )");
        }while(sc.nextInt() != 1);
    }
}
