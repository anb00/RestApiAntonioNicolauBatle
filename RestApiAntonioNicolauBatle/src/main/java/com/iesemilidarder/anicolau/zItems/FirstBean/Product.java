package com.iesemilidarder.anicolau.zItems.FirstBean;

public class Product {
    private int id;
    public String Prodname;
    public String ProdLoca;
    private String Description;
    private Boolean available;
    private int complet;
    private int empty;
    private int total;

    public Product() {
    }

    public Product(int id, String Prodname, String ProdLoca, String Description, Boolean available, int complet, int empty, int total) {
        this.id = id;
        this.Prodname = Prodname;
        this.ProdLoca = ProdLoca;
        this.Description = Description;
        this.available = available;
        this.complet = complet;
        this.empty = empty;
        this.total = total;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProdname() {
        return Prodname;
    }

    public void setProdname(String prodname) {
        Prodname = prodname;
    }

    public String getProdLoca() {
        return ProdLoca;
    }

    public void setProdLoca(String prodLoca) {
        ProdLoca = prodLoca;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public int getComplet() {
        return complet;
    }

    public void setComplet(int complet) {
        this.complet = complet;
    }

    public int getEmpty() {
        return empty;
    }

    public void setEmpty(int empty) {
        this.empty = empty;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }





    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", nameOfProduct=" + Prodname + ",ProdLocation; " +ProdLoca+", Description"+Description+ ",Available:"+available+",Completo:"+complet+",empty"+empty+",total"+total+ '}';
    }

    public String getProductName() {
        return getProdname();
    }

    public void setProductName(String productName) {
        this.Prodname = Prodname;
    }
}
