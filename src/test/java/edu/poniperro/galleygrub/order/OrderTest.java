package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OrderTest {

    @Test
    public void addItemTest() {
        Comanda order = new Order();

        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafoam Soda", 1.00);

        assertEquals(5, order.size());
    }    
}
