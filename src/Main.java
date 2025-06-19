import entities.*;
import entities.enums.Dipartimento;

public class Main {
    public static void main(String[] args) {
        /*
        Dipendente a1 = new Dipendente(1500, Dipartimento.PRODUZIONE);
        Dipendente a2 = new Dipendente(2000,Dipartimento.AMMINISTRAZIONE);
        Dipendente a3 = new Dipendente(1500,Dipartimento.VENDITE);

        Dipendente[] array = {a1, a2, a3};

        for (int i=0; i<array.length; i++){
            System.out.println(a1.getMatricola());
        }
        */

        Dirigente d1 = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        d1.calculateSalary();
        Dirigente d2 = new Dirigente(Dipartimento.AMMINISTRAZIONE);
        d2.calculateSalary();
        DipendenteFullTime dF1 = new DipendenteFullTime(Dipartimento.PRODUZIONE, 17.5);
        dF1.calculateSalary();
        DipendenteFullTime dF2 = new DipendenteFullTime(Dipartimento.VENDITE, 0);
        dF1.calculateSalary();
        DipendentePartTime dP1 = new DipendentePartTime(Dipartimento.PRODUZIONE, 100 ,0);
        dP1.calculateSalary();

        System.out.println("-----SCHEDARIO DIPENDENTI-----");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(dF1);
        System.out.println(dF2);
        System.out.println(dP1);
        System.out.println("-------------------");

        Dipendente[] array = {d1,d2,dF1,dF2,dP1};
        double totStipendi = 0;
        for (int i=0; i<array.length; i++){
            System.out.println(array[i].calculateSalary());
            totStipendi+=array[i].calculateSalary();
        }
        System.out.println("Il costo totale degli stipendi dei dipendenti è :" + totStipendi);

        dF1.checkIn();
        d1.checkIn();

        Volontario v1 = new Volontario("Alessio",20,"Bello e Bravo");
        v1.checkIn();

    }
}