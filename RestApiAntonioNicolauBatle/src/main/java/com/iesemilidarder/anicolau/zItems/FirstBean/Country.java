package com.iesemilidarder.anicolau.zItems.FirstBean;

public class Country {

    private Long id;
    private String name;
    private String Service0;
    private String Service1;
    private String Service2;
    private Boolean disponibility;

    public Country() {
    }

    public Country(Long id, String name, Boolean disponibility, String Service0, String Service1, String Service2) {
        this.id = id;
        this.name = name;
        this.Service0 = Service0;
        this.Service1 = Service1;
        this.Service2 = Service2;
        this.disponibility = disponibility;
    }

    public String getService0() {
        return Service0;
    }

    public void setService0(String service0) {
        Service0 = service0;
    }

    public String getService1() {
        return Service1;
    }

    public void setService1(String service1) {
        Service1 = service1;
    }

    public String getService2() {
        return Service2;
    }

    public void setService2(String service2) {
        Service2 = service2;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(Boolean disponibility) {
        this.disponibility = disponibility;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", nameOfCountry=" + name + ",ServicesAvailables; "+ Service0 + "," + Service1 + "," + Service2 +
                ", Disponibility=" + disponibility + '}';
    }
}