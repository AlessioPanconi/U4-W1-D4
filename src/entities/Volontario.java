package entities;

import entities.enums.Dipartimento;

public class Volontario {

    private String nome;
    private int eta;
    private String cv;

    //COSTRUTTORE
    public Volontario( String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

}
