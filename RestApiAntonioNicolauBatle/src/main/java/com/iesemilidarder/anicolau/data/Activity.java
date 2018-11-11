package com.iesemilidarder.anicolau.data;


        /****** $All Ways goes to Rome ****/


public class Activity {

    protected String name;
    protected double price;

    public Activity(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String obtenerDescription(){
        return "Nombre: " + name +
                ", Precio: "+ price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }
}