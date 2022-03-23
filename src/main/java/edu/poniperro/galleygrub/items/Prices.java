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

public enum Prices {
    CHEESE(0.25),
    SAUCE(0.50),
    MEDIUM(0.25),
    LARGE(0.50);
    
    private double extra;

    private Prices(double extra) {
        this.extra = extra;
    }

    public static double extraPrice(String extra) {
        return Prices.valueOf(extra.toUpperCase()).extra;
    }


    public static void display() {
        for (Prices key : Prices.values()) {
            System.out.println("\t" + key.name() + " = " + key.extra);
        }
    }

    public static void init_prices() {
    }
    
}
