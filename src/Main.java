import entities.*;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(25,50);
        //System.out.println("l'aerea è :"+ r1.getArea());
        //System.out.println("il perimetro è:"+ r1.getPerimeter());
        r1.print();
        Rettangolo r2 = new Rettangolo(25,50,60,40);
        r2.print2();
        //------------------------ES2----------------------
        Random random=new Random();

        Chiamata chiamata1 = new Chiamata(random.nextInt(1,20),random.nextInt(33000000,39000000));
        Chiamata chiamata2 = new Chiamata(random.nextInt(1,20),random.nextInt(33000000,39000000));
        Chiamata chiamata3 = new Chiamata(random.nextInt(1,20),random.nextInt(33000000,39000000));
        Chiamata chiamata4 = new Chiamata(random.nextInt(1,20),random.nextInt(33000000,39000000));
        Chiamata chiamata5 = new Chiamata(random.nextInt(1,20),random.nextInt(33000000,39000000));
        chiamata1.getNumber();
        chiamata1.getMin();
        Sim sim1= new Sim(347895632);
        sim1.printSim();
        sim1.chiama(chiamata1);
        System.out.println("listaaaa:"+ Arrays.toString(sim1.getListaChiamate()));
        //-----------------------ES3----------------------------------
        Articolo articolo1= new Articolo(random.nextInt(1,1000),"Ipad Pro",499.99,100);
        Articolo articolo2= new Articolo(random.nextInt(1,1000),"Iphone",999.99,200);
        Articolo articolo3= new Articolo(random.nextInt(1,1000),"S25 Ultra",999.99,400);
        Articolo[]listaArticoli = {articolo1,articolo2,articolo3};
        System.out.println(articolo1);
        Cliente cliente = new Cliente(random.nextInt(1,1000),"DavideMancini","mancinidavide73@gmail.com","17/02/2016");
        System.out.println(cliente);
        Carrello carrello = new Carrello(cliente,listaArticoli);
        System.out.println(carrello);
        System.out.println("totale"+ carrello.getTotal());
    }
}