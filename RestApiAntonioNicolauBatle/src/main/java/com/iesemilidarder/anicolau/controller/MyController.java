package com.iesemilidarder.anicolau.controller;
import com.iesemilidarder.anicolau.service.ICountryService;
import java.util.List;
import com.iesemilidarder.anicolau.zItems.FirstBean.Country;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

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


    @RequestMapping(value = "/getProductById/{id}", method = GET)
    @ResponseBody
    public Product getProductById(
            @PathVariable(value="id") Integer id) {
        for (Product item:countryService.findProducts()) {
            if(id!=null&&id==null && item.getId()==id){

               System.out.println();
               //System.out.println("Descripción:"+id);
            }
        }
        return   null;
    }

/*
    @RequestMapping(value = "/getProductById/{id}", method = GET)
    @ResponseBody
    public Product getProductById(
            @PathVariable Integer id,String item) {
        return "Get a specific Description with id=" + id+","+item+","+Product;
    }

*/

}