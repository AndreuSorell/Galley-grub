package edu.poniperro.galleygrub.items;

public class Item implements Product {
    private String name = "";
    private Double price = 0d;
    private String extra = "";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }

    @Override
    public String extra() {
        return this.extra;
    }

    @Override
    public Boolean isRegular() {
        if (extra() == "") {
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public String toString() {
        if (extra() == "") {
            return name()+ "...." + price() + "$";
        }
        else {
            return name() + " w/ " + extra() + "...." + price() + "$ + " + Prices.extraPrice(extra()) +  "$";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Item) {
            return this.name.equals(((Item)obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    } 
    
}
