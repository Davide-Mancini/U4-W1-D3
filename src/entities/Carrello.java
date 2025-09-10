package entities;

import java.util.Arrays;

public class Carrello {
    //ATTRIBUTI
    private Cliente cliente;
    private Articolo[] articoli;
    //COSTRUTTORI
    public Carrello(Cliente cliente, Articolo[] articoli){
        this.cliente=cliente;
        this.articoli=articoli;

    }

    @Override
    public String toString() {
        return "Carrello{" +
                "cliente=" + cliente +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }

    //METODI
    public double getTotal (){
    double totale = 0;
    for(Articolo a: articoli){
        totale=totale+a.getPrezzo();
    }
        return totale;
    }

}
