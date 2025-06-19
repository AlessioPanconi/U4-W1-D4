package entities;

import interfaces.checkToWork;

public class Volontario implements checkToWork {

    private String nome;
    private int eta;
    private String cv;

    //COSTRUTTORE
    public Volontario( String nome, int eta, String cv) {
        this.nome = nome;
        this.eta = eta;
        this.cv = cv;
    }

    //METODI
    @Override
    public void checkIn(){
        System.out.println("Il Volontario " + this.nome + " è entrato a lavoro");
    };

}
