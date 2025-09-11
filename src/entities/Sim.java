package entities;

import java.util.Arrays;

public class Sim {
    //ATTRIBUTI
    private long numeroTelefono;
    private double creditoDisponibile;
    private Chiamata[] listaChiamate;
    //COSTRUTTORI
    public Sim(long numeroTelefono){
        this.numeroTelefono=numeroTelefono;
        this.creditoDisponibile=0;
        this.listaChiamate= new Chiamata[5];



    }
    //METODI

    public void printSim (){
        System.out.println("numero telefono:"+this.numeroTelefono);
        System.out.println("credeto"+this.creditoDisponibile);

    }



    @Override
    public String toString() {
        return "Sim{" +
                "numeroTelefono=" + numeroTelefono +
                ", creditoDisponibile=" + creditoDisponibile +
                ", listaChiamate=" + Arrays.toString(listaChiamate) +
                '}';
    }
}
