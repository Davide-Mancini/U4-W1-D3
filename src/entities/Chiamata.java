package entities;

public class Chiamata {
    //ATTRIBUTI
    private long minutiChiamata;
    private long numeroChiamato;
    //COSTRUTTORI
    public Chiamata(long minutiChiamata, long numeroChiamato){
     this.minutiChiamata=minutiChiamata;
     this.numeroChiamato=numeroChiamato;
    }
    //METODI
    public int[] getNumber(){
        System.out.println("numero chiamato:"+this.numeroChiamato);
        return new int[0];
    }
    public void getMin(){
        System.out.println("minuti chiamata:"+this.minutiChiamata);
    }

    public long getNumeroChiamato() {
        return numeroChiamato;
    }

    public long getMinutiChiamata() {
        return minutiChiamata;
    }
}
