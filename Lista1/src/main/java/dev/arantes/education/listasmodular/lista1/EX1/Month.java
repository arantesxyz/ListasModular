package dev.arantes.education.listasmodular.lista1.EX1;

public enum Month {
    January(1, "Janeiro"),
    February(2, "Fevereiro"),
    March(3, "Março"),
    April(4, "Abril"),
    May(5, "Maio"),
    June(6, "Junho"),
    July(7, "Julho"),
    August(8, "Agosto"),
    September(9, "Setembro"),
    October(10, "Outubro"),
    November(11, "Novembro"),
    December(12, "Dezembro");

    private int number;
    private String name;

    Month(int number, String name) {
        this.number = number;
        this.name = name;
    }

    static Month getMonth(int number) {
        if (number < 1 || number > 12) {
            throw new IndexOutOfBoundsException("O número informado não é um mês válido!");
        }

        return Month.values()[number];
    }

    public String getName() {
        return this.name;
    }
}
