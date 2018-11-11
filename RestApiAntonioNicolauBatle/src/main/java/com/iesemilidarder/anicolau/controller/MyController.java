package com.iesemilidarder.anicolau.controller;
import com.iesemilidarder.anicolau.data.Activities;
import com.iesemilidarder.anicolau.service.ActivitiesService;
import com.iesemilidarder.anicolau.service.ICountryService;
import java.util.List;
import com.iesemilidarder.anicolau.zItems.FirstBean.Country;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    ICountryService countryService;
    /* /getAllProducts/{area} */

    @RequestMapping(value = "/getAllproducts")
    public List<Country> getAll() {

        List<Country> countries = countryService.findAll();

        return countries;
    }


     /* Indicaciones para el Mapeo en la premaquitación */
     @RequestMapping(value = "/getProduct/")
     public List<Country> getCountry() {

         List<Country> country = countryService.findAll();

         return country;
     }


     /* /getProductTypes ^[ok]*/

    @Autowired
    ICountryService ProductService;
    @RequestMapping(value = "/getProductTypes")
    public List<Product> getProducts() {

        List<Product> products = ProductService.findProducts(); /** implementado en ICOUNTRY ? */

        return products;
    }

    @RequestMapping(value = "/getActivities")
    public String getActivities() {



        return "Las ACTIVIDADES se Muestran en el /getAllProducts ";
    }

/* El {id} Para que muestre un producto específico no llega a funcionar */

    @RequestMapping(value = "/getProductById/{id}", method= RequestMethod.GET)
    public Product getProductById(@PathVariable Integer id, Product X1){
        Product product = ProductService.getProductById(id);
        return product;
    }

}