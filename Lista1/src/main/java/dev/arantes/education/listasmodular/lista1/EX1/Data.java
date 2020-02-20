package dev.arantes.education.listasmodular.lista1.EX1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.setDia(dia);
        this.setMes(mes);
        this.setAno(ano);
    }

    public Data() {
        this.setDia(1);
        this.setMes(1);
        this.setAno(2001);
    }

    public boolean eAnoBisexto() {
        return this.getAno() % 4 == 0;
    }

    public void proximoDia() {
        if (this.getMes() == 2) {
            if (eAnoBisexto()) {
                if (this.getDia() == 29) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            } else {
                if (this.getDia() == 28) {
                    this.setDia(1);
                    this.setMes(this.getMes() + 1);
                } else {
                    this.setDia(this.getDia() + 1);
                }
            }
        }

        if (this.getMes() == 12) {
            if (this.getDia() == 31) {
                this.setDia(1);
                this.setMes(1);
                this.setAno(this.getAno() + 1);
            } else {
                this.setDia(this.getDia() + 1);
            }
            return;
        }

        if (Arrays.asList(1, 3, 5, 7, 8, 10).contains(this.getMes())) {
            if (this.getDia() == 31) {
                this.setDia(1);
                this.setMes(this.getMes() + 1);
            } else {
                this.setDia(this.getDia() + 1);
            }
            return;
        }

        if (this.getDia() == 30) {
            this.setDia(1);
            this.setMes(this.getMes() + 1);
        } else {
            this.setDia(this.getDia() + 1);
        }

    }

    public void adicionaDias(int dias) {
        for (int i = 0; i < dias; i++) {
            proximoDia();
        }
    }

    public int diasNoMes() {
        if (this.getMes() == 2) {
            if (eAnoBisexto()) {
                return 29;
            }
            return 28;
        }

        if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(this.getMes())) {
            return 31;
        }
        return 30;
    }

    public String diaDaSemana() throws ParseException {
        DateFormat dayFormat = new SimpleDateFormat("EEEE");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String date = this.getDia() + "/" + this.getMes() + "/" + this.getAno();

        return dayFormat.format(dateFormat.parse(date));
    }

    public String toString(){
        return this.getDia() + " de " + Month.getMonth(this.getMes()).getName() + " de " + this.getAno();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

