package dev.arantes.education.listasmodular.lista1.EX2;

import java.util.Scanner;

public class App2 implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String name = sc.nextLine();

        System.out.print("Informe seu cpf: ");
        String cpf = sc.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Informe seu sexo ( M [1] - F [2] ): ");
        int sexo = sc.nextInt();

        if (sexo < 1 || sexo > 2) {
            throw new IllegalArgumentException("Sexo inválido!");
        }

        Pessoa pessoa = new Pessoa(name, cpf, idade, sexo);

        if (pessoa.eMaiorDeIdade()){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você não é maior de idade!");
        }
    }
}
