package entities;

import entities.enums.Dipartimento;
import java.util.Random;


public abstract class Dipendente {

    protected final int matricola;
    protected double stipendio;
    protected Dipartimento dipartimento;

    //GETTER
    public int getMatricola() {
        return matricola;
    }
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //SETTER
    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //COSTRUTTORE
    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola=rndm.nextInt(1, 10000);
        this.dipartimento=dipartimento;
    }

    //METODI
    public abstract double calculateSalary();
    //

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola=" + matricola +
                ", stipendio=" + stipendio +
                ", dipartimento=" + dipartimento +
                '}';
    }
}
