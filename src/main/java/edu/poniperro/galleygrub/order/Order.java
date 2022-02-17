package edu.poniperro.galleygrub.order;

import java.util.ArrayList;
import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public class Order implements Comanda {
    private Double total=0d;
    private List<Item> items = new ArrayList<Item>();
    
    public Order() {
    }

    @Override
    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    @Override
    public void addItem(String name, double price, String extra) {
        Item item = new Item(name, price, extra);
        items.add(item);
    }

    @Override
    public int size() {
        return itemList().size();
    }

    @Override
    public List<Item> itemList() {
        return this.items;
    }

    @Override
    public Double getTotal() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateTotal(Double price) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void display() {
        System.out.println("\n\t--- ORDER ---");
        for (Item item : itemList()) {
            System.out.println("\t" + item.toString());
        }
    }
    
}
