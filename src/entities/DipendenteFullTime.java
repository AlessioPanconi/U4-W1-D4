package entities;

import entities.enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {

    private double oreStraordinari;

    //COSTRUTTORE
    public DipendenteFullTime(Dipartimento dipartimento, double oreStraordinari) {
        super(dipartimento);
        this.oreStraordinari=oreStraordinari;
        this.stipendio=calculateSalary();
    }
    //SETTER
    public void setOreStraordinari(double oreStraordinari) {
        this.oreStraordinari = oreStraordinari;
    }

    //METODI
    @Override
    public double calculateSalary(){
        if(this.oreStraordinari==0)
        {
            return 1500 ;
        }else{
            return 1500 + this.oreStraordinari*17;
        }
    };

}
