package com.iesemilidarder.anicolau.service;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Override
    public List<Product> findProducts() {
            List<Product> Products = new ArrayList<>();

            Products.add(new Product(1,"Shopping","World Wide Web","dfsdf",true,23,234,23));
            Products.add(new Product(1,"Swimming with Sharks","MIAMI","Sharks",true,23,234,23));
            //Products.add(new Product(2,"Swimming with Sharks","dasd","Buy all over the City ",23,234,23));
            //Products.add(new Product(3,"Climning","dasd","Buy all over the City ",23,234,23));
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
    public String getProductById() {
        return null;
    }
}
