package com.iesemilidarder.anicolau.data;
import java.util.*;
public class Country {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("1");
        miLista.add("2");
        miLista.add("3");
        miLista.add("4");
        //Elemento repetido
        miLista.add("4");
        imprimir(miLista);

        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        //NO permite elementos repetidos, lo ignora
        miSet.add("300");
        imprimir(miSet);

        Map miMap = new HashMap();
        miMap.put("Spain","");
        miMap.put("2", "Lucy");
        miMap.put("3", "Chamo");
        miMap.put("4", "Alexander");
        //se imprimen todas las llaves
        imprimir(miMap.keySet());
        //Se imprimen todos los valores
        imprimir(miMap.values());

    }

    private static void imprimir (Collection coleccion) {
        for (Object elemento : coleccion) {
            System.out.print(elemento+ " ");
        }
        System.out.println("");
    }
}