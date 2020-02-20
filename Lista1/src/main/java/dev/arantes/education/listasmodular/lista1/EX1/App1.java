package dev.arantes.education.listasmodular.lista1.EX1;

import java.text.ParseException;
import java.util.Scanner;

public class App1 implements Runnable {
    public void run() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = sc.nextInt();

        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("O mês informado não é válido!");
        }

        System.out.println("Informe o número do mês: ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mês informado não é válido!");
        }

        System.out.println("Informe o ano: ");
        int ano = sc.nextInt();

        Data date = new Data(dia, mes, ano);

        try {
            System.out.println(date.diaDaSemana() + ". O mês tem " + date.diasNoMes() + " dias.");
            System.out.println("Informe o número de dias que deseja avançar: ");
            date.adicionaDias(sc.nextInt());
            System.out.println("Avançado para " + date.diaDaSemana() + " dia " + date.getDia());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
