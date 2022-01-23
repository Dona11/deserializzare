package com.example;

import java.util.ArrayList;

public class Root{

    private int annoDiInizio;
    private Aula aula;
    private String classe;
    private int numeroFinestre;
    private String specializzazione;
    private ArrayList <Studenti> studenti;

    public int getAnnoDiInizio() {
        return annoDiInizio;
    }
    public void setAnnoDiInizio(int annoDiInizio) {
        this.annoDiInizio = annoDiInizio;
    }
    public Aula getAula() {
        return aula;
    }
    public void setAula(Aula aula) {
        this.aula = aula;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNumeroFinestre() {
        return numeroFinestre;
    }
    public void setNumeroFinestre(int numeroFinestre) {
        this.numeroFinestre = numeroFinestre;
    }
    public String getSpecializzazione() {
        return specializzazione;
    }
    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }
    public ArrayList<Studenti> getStudenti() {
        return studenti;
    }
    public void setStudenti(ArrayList<Studenti> studenti) {
        this.studenti = studenti;
    }
}
