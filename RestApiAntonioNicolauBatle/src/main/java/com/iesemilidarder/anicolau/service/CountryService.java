package com.iesemilidarder.anicolau.service;
import com.iesemilidarder.anicolau.zItems.FirstBean.Country;
import java.util.ArrayList;
import java.util.List;

import com.iesemilidarder.anicolau.zItems.FirstBean.Product;
import org.springframework.stereotype.Service;

@Service
public class CountryService implements ICountryService {

    @Override
    public List<Country> findAll() {

        List<Country> countries = new ArrayList<>();

        countries.add(new Country(1L, "New york",true,"City Tour","Shopping","EXHIBITION Car Race(NASDAQ)" ));
        countries.add(new Country(2L, "Moscu",true,"City Tour (kremlin to Mountains)","Shopping","Party at Night"));
        countries.add(new Country(3L, "Barcelona",true,"City Tour","Shopping",".)"));
        countries.add(new Country(4L, "Cuba", true,"Swimming with turtles","Jirafe Zoo","EXHIBITION Elephant Attraction"));
        countries.add(new Country(5L, "Miami",true,"Some Beach Around Miami","Shopping","Party at night"));
        countries.add(new Country(6L, "Ibiza",true,"Swimming with Sharks","Fishing","Relax & SPA"));
        countries.add(new Country(7L, "Vietnam", true,"City Tour","Outdoor & Fruit Market","."));
        countries.add(new Country(8L, "Madrid",false,"City Tour","Shopping","WARNER BROSS(Atraction PARK)"));

        return countries;
    }

    @Override
    public List<Product> findProducts() {
        List<Product> Products = new ArrayList<>();
        System.out.println("All kind of Products");
        Products.add(new Product(1,"Shopping","New York","De Compras con Chofer de Limusina , Mr Shopper, Estilista y ManCouch, todo el equipo te acompaña.",true,23,234,23));
        Products.add(new Product(1,"City Tour","New York ","Breve Tour En autobus y luego Coche por las calles más emblemáticas De NYC",true,23,234,23));
        Products.add(new Product(2,"Climbing","Moscu","Escalada en las Montañas de Moscú",true,23,234,23));
        Products.add(new Product(2,"City Tour","Moscú","Ruta Touristica por Moscu",true,23,234,23));
        Products.add(new Product(3,"Barcelona","Barcelona","De Compras con Chofer de Limusina , Mr Shopper, Estilista y ManCouch, todo el equipo te acompaña.",true,23,234,23));
        Products.add(new Product(3,"Barcelona","Barcelona","De Compras con Chofer de Limusina , Mr Shopper, Estilista y ManCouch, todo el equipo te acompaña.",true,23,234,23));
        //Products.add(new Product(2,"Swimming with Sharks","dasd","Buy all over the City ",23,234,23));
        //Products.add(new Product(3,"Climning","Breve Inmersión en Aguas Infestadas de Tiburones Crias.","Buy all over the City ",23,234,23));
        //Products.add(new Product(4,"City Tour","dasd","Buy all over the City ",23,234,23));
        //Products.add(new Country(2L, "Moscu", true, "City Tour (kremlin to Mountains)", "Shopping", "Party at Night"));
        //Products.add(new Country(3L, "Barcelona", true, "City Tour", "Shopping", ".)"));
        //Products.add(new Country(4L, "Cuba", true, "Swimming with turtles", "Jirafe Zoo", "EXHIBITION Elephant Attraction"));
        //Products.add(new Country(5L, "Miami", true, "Some Beach Around Miami", "Shopping", "Party at night"));
        //Products.add(new Country(6L, "Ibiza", true, "Swimming with Sharks", "Fishing", "Relax & SPA"));
        //Products.add(new Country(7L, "Vietnam", true, "City Tour", "Outdoor & Fruit Market", "."));
        //Products.add(new Country(8L, "Madrid", false, "City Tour", "Shopping", "WARNER BROSS(Atraction PARK)"));
        return Products;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }


}