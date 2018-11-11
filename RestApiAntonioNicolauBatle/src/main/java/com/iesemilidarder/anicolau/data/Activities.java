package com.iesemilidarder.anicolau.data;
import java.util.ArrayList;


public class Activities {
    private  String alfa = "☼" ;
    private String beta = "§";
    private String gamma = "♥";
    private String pass = "▼▼♪☺";
    public static void main(String[] args){
            ArrayList<String> actividades;

            actividades = new ArrayList<String>();

            actividades.add("DIVING");

            actividades.add("CLIMBING");
            actividades.add("SWIMNING WITH SHARKS");
            actividades.add("CITY TOUR");
            actividades.add("SHOPPING");
            actividades.add("FITNESS");
            actividades.add("EATING & MEALS");
            actividades.add("RELAX & SPA");

            for (int i = 0; i < actividades.size(); i++) {
                //    System.out.println(" $ "+actividades.get(i)+"."+taxas.get(i)+);
            }


    ArrayList<Double> taxas;

        taxas = new ArrayList<Double>();
        taxas.add(50.00);
        taxas.add(30.00);
        taxas.add(5.0);
        taxas.add(2.00);
        taxas.add(150.00);
        taxas.add(100.00);
        taxas.add(10.00);

          for (int a = 0; a < taxas.size(); a++) {
              System.out.println("All Our Services are warranty with Top Quality!! ☻»»»»»"+" "+actividades.get(a)+" »»»»»»»»»»»»" +"+"+" "+taxas.get(a)+" € de taxas");
              //System.out.println("");
          }


    }
}
