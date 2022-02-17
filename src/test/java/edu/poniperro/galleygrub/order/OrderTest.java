package edu.poniperro.galleygrub.order;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {
    private Comanda order;
    @Before
    public void setupOrder() {
        order = new Order();
    }
    
    @Test
    public void constructorTest() {
        assertNotNull("order creada", order);
    }

    @Test
    public void addItemTest() {
        order.addItem("Krabby Patty", 1.25);
        order.addItem("Coral Bits", 1.00);
        order.addItem("Kelp Rings", 1.50);
        order.addItem("Golden Loaf", 2.00);
        order.addItem("Seafoam Soda", 1.00);

        assertEquals(5, order.size());
    }

    @Test
    public void updateTotalTest() {
        order.updateTotal(0.25);
        assertEquals(0.25, order.getTotal(), 0);
    }
}
