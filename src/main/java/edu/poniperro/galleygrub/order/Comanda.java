package edu.poniperro.galleygrub.order;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;

public interface Comanda {
    public void addItem(String name, double price);
    public void addItem(String name, double price, String extra);
    public int size();
    public List<Item> itemList();
    public Double getTotal();
    public void updateTotal(Double price);
    public void display();
}
