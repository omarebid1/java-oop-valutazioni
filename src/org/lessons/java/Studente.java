package org.lessons.java;

import java.util.Random;


public class Studente {

    Random random = new Random();


    // ATTRIBUTI

    private int id;
    private int assenze;

    private double mediaVoti;


    //  COSTRUTTORI

    public Studente(){

    }

    public Studente(int id){

        this.id = id+1;
        this.setAssenze(random.nextInt(101));
        this.setMediaVoti(random.nextDouble(5));
        decimal();

    }


    //  SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public void setAssenze(int assenze) {
        this.assenze = assenze;
    }

    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }


    //  GETTERS

    public int getId() {
        return id;
    }

    public double getMediaVoti() {
        return mediaVoti;
    }

    public int getAssenze() {
        return assenze;
    }


    //  METODI

    private void decimal(){

        double d = (double) (Math.round(mediaVoti*100.0)/100.0);
        setMediaVoti(d);
    }

    public boolean isPromosso(){

        if(this.getAssenze() > 50){
            return false;
        } else if (this.getAssenze() > 25 && this.getAssenze() < 50 && this.getMediaVoti() > 2) {
            return true;
        } else return getAssenze() < 25 && getMediaVoti() >= 2;
    }

    public String passed(){

        if (isPromosso())
            return "Promosso";
        else
            return "Bocciato";
    }

    @Override
    public String toString() {
        return "Studente id." + id +
                ", Percentuale Assenze: " + assenze +
                ", mediaVoti: " + mediaVoti + ", è " + passed();
    }
}
