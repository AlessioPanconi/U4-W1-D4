package entities;

import entities.enums.Dipartimento;

public class Dirigente extends Dipendente{

    //COSTRUTTORE
    public Dirigente( Dipartimento dipartimento) {
        super(dipartimento);
        this.stipendio=calculateSalary();
    }

    //METODI
    @Override
    public double calculateSalary(){
        return 3000;
    };

}
