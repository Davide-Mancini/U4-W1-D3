package entities;

public class Articolo {
    //ATTRIBUTI
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo ;
    private int pezziDisponibili;

    @Override
    public String toString() {
        return "Articolo{" +
                "codiceArticolo=" + codiceArticolo +
                ", descrizioneArticolo='" + descrizioneArticolo + '\'' +
                ", prezzo=" + prezzo +
                ", pezziDisponibili=" + pezziDisponibili +
                '}';
    }

    public double getPrezzo() {
        return prezzo;
    }

    //COSTRUTTORI
    public Articolo(int codiceArticolo,String descrizioneArticolo, double prezzo, int pezziDisponibili){
        this.codiceArticolo=codiceArticolo;
        this.descrizioneArticolo=descrizioneArticolo;
        this.prezzo=prezzo;
        this.pezziDisponibili=pezziDisponibili;
        //METODI


    }
}
