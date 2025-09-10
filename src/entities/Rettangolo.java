package entities;

public class Rettangolo {
    //ATTRIBUTI
    private int altezza;
    private int larghezza;
    private int altezza1;
    private int larghezza1;
    private int altezza2;
    private int larghezza2;
    //COSTRUTTORI
    public Rettangolo(int altezza, int larghezza){
        this.altezza=altezza;
        this.larghezza=larghezza;

    }
    public Rettangolo(int altezza1, int larghezza1,int altezza2,int larghezza2){
        this.altezza1=altezza1;
        this.larghezza1=larghezza1;
        this.altezza2=altezza2;
        this.larghezza2=larghezza2;

    }
        //METODI
    public int getArea(){
        return this.altezza*this.larghezza;
    }
    public int getArea2(){
        return this.altezza1*this.larghezza1;
    }
    public int getArea3(){
        return this.altezza2*this.larghezza2;
    }
    public int getPerimeter(){
        return 2*(this.larghezza+this.altezza);

    }
    public int getPerimeter2(){
        return 2*(this.larghezza1+this.altezza1);

    }
    public int getPerimeter3(){
        return 2*(this.larghezza2+this.altezza2);

    }
    public int areeSum(){
        return getArea2()+getArea3();
    }
    public int perimetersSum(){
        return getPerimeter2()+getPerimeter3();
    }
    public void print(){
        System.out.println("l'area è:"+this.getArea());
        System.out.println("il perimetro è:"+this.getPerimeter());
    }
    public void print2(){
        System.out.println("area del primo:"+getArea2());
        System.out.println("perimetro del primo:"+getPerimeter2());
        System.out.println("area del secondo:"+getArea3());
        System.out.println("permetro del secondo:"+getPerimeter3());
        System.out.println("la somma delle aree è:"+ areeSum());
        System.out.println("la somma dei perimetri è:"+perimetersSum());
    }
}
