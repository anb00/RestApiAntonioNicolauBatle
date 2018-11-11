package com.iesemilidarder.anicolau.data;
import java.io.Serializable;

public abstract class BeanCountry implements Serializable {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIniciales() {
        return iniciales;
    }

    public void setIniciales(String iniciales) {
        this.iniciales = iniciales;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private String iniciales;
    private String Location;
    private String description;
    private int id;


    public BeanCountry() {
    }



    public BeanCountry(String name,String iniciales,String Location,String description, int id) {
        this.name = name;
        this.iniciales = iniciales;
        this.Location = Location;
        this.description = description;
        this.id = id;
    }







}