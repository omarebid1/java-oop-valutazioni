package org.lessons.java;


public class Main extends Studente {

    public static void main(String[] args) {


        Studente[] listaStudenti = new Studente[20];

        for (int i = 0; i < listaStudenti.length; i++) {

            listaStudenti[i] = new Studente(i);
        }

        int sommaPromossi = 0;

        for (Studente student: listaStudenti) {

            if (student.isPromosso()){
                sommaPromossi++;
            }

            System.out.println(student.toString());
        }

        System.out.println("Totali Promossi : " + sommaPromossi);

    }

}
