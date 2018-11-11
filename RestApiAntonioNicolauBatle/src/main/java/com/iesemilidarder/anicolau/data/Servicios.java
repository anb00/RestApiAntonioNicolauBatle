package com.iesemilidarder.anicolau.data;

public class Servicios extends Engine {
    public Servicios(String ServiceType ){
        super(ServiceType);
    }

    public void mostrarserv() {
        System.out.println("El servicio es de clase:"+ this.getClass().getSimpleName());
    }



}
