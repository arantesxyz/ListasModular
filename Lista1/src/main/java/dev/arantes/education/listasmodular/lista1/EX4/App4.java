package dev.arantes.education.listasmodular.lista1.EX4;

public class App4 implements Runnable {
    public void run() {
        final Conversor conversor = new Conversor();

        System.out.println(
                "A conversão de 10 centimetros para polegadas é: " +
                conversor.converterCentimetrosParaPolegadas(10)
        );
    }
}
