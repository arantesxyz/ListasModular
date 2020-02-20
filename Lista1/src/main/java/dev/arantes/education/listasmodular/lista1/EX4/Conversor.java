package dev.arantes.education.listasmodular.lista1.EX4;
public class Conversor {
    private static final double PES = 3.28084;
    private static final double POLEGADAS = 39.3701;

    public double converterPesParaMetros(double valor){
        return Math.round(valor/PES);
    }

    public double converterPesParaPolegadas(double valor){
        return Math.round((valor * POLEGADAS)/PES);
    }

    public double converterPesParaCentimetros(double valor){
        return Math.round((valor * 100)/PES);
    }

    public double converterPolegadasParaMetros(double valor){
        return Math.round(valor/POLEGADAS);
    }

    public double converterPolegadasParaPes(double valor){
        return Math.round((valor * PES)/POLEGADAS);
    }

    public double converterPolegadasParaCentimetros(double valor){
        return Math.round((valor * 100)/POLEGADAS);
    }

    public double converterMetrosParaPes(double valor){
        return Math.round(valor * PES);
    }

    public double converterMetrosParaPolegadas(double valor){
        return Math.round(valor * POLEGADAS);
    }

    public double converterMetrosParaCentimetros(double valor){
        return Math.round(valor * 100);
    }

    public double converterCentimetrosParaPes(double valor){
        return Math.round((valor * PES)/100);
    }

    public double converterCentimetrosParaPolegadas(double valor){
        return Math.round((valor * POLEGADAS)/100);
    }

    public double converterCentimetrosParaMetros(double valor){
        return Math.round(valor/100);
    }
}
