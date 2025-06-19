package entities;

import entities.enums.Dipartimento;

public class DipendentePartTime extends Dipendente{

    private double oreLavoro;
    private double oreStraordinari;

    //COSTRUTTORE
    public DipendentePartTime(Dipartimento dipartimento,double oreLavoro,double oreStraordinari) {
        super(dipartimento);
        this.oreLavoro=oreLavoro;
        this.oreStraordinari=oreStraordinari;
        this.stipendio=calculateSalary();
    }
    //SETTER
    public void setOreLavoro(double oreLavoro) {
        this.oreLavoro = oreLavoro;
    }

    public void setOreStraordinari(double oreStraordinari) {
        this.oreStraordinari = oreStraordinari;
    }

    //METODI
    @Override
    public double calculateSalary(){
        if(this.oreStraordinari==0)
        {
            return this.oreLavoro*12;
        }else{
            return this.oreLavoro*12 + this.oreStraordinari*15;
        }
    };

}
