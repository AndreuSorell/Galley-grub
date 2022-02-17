package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

/**
         * Crea un diccionario con los precios
         * de los extras.
         *  
         *  Los precios de los extras son estos:
         *  - cheese +0.25
         *  - sauce +0.50
         *  - medium +0.25
         *  - large +0.50
         * 
         * Lee los precios de los items en la imagen 
         * del menu proporcionada.
         */

public class Prices {
    private static final double cheese = 0.25;
    private static final double sauce = 0.50;
    private static final double medium = 0.25;
    private static final double large = 0.50;
    private static final Map<String, Double> precios = new HashMap<String, Double>();



    public static void init_prices() {
        precios.put("cheese", cheese);
        precios.put("sauce", sauce);
        precios.put("medium", medium);
        precios.put("large", large);
    }



    public static void display() {
        for (String key : precios.keySet()) {
            System.out.println("\t" + key + " = " + precios.get(key));
        }
    }
    
}
