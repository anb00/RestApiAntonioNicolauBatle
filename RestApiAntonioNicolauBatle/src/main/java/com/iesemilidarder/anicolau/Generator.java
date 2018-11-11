package com.iesemilidarder.anicolau;
//package com.iesemilidarder.anicolau.data.BeanCountry;
import com.iesemilidarder.anicolau.data.Activity;
import com.iesemilidarder.anicolau.zItems.FirstBean.Product;
import org.apache.commons.lang3.StringUtils;
public class Generator {
    public static void main(String... args) {
        try {
            System.out.println("************************");
            System.out.println("*******SERVICIOS********");
            System.out.println("************************");
            Activity Relax = new Activity("Relax", 300);
            //System.out.println(Relax.obtenerDescription()+"\n");
            System.out.println(Relax.obtenerDescription());
            Activity Shopping = new Activity("Shopping", 400);
            System.out.println(Shopping.obtenerDescription());
            Activity Senderismo = new Activity("Senderismo", 00);
            System.out.println(Senderismo.obtenerDescription());
            Activity Camping = new Activity("Camping", 100);
            System.out.println(Camping.obtenerDescription());
            System.out.println("**************************");
            System.out.println("*******ACTIVIDADES********");
            System.out.println("**************************");
           // Product Pack0 = new Product("Pack Viaje a India",2000,"Todo Incluido OFERTA!");
           // System.out.println(Pack0.obtenerDescription());
            //Product Pack1 = new Product("Pack Viaje a Japón",1500,"Todo Incluido OFERTA!");
             // System.out.println(Pack1.obtenerDescription());


    } catch (Exception r) {
        NewHelper.errRate(r);
    }

}


















}
