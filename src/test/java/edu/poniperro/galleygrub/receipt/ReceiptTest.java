package edu.poniperro.galleygrub.receipt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.galleygrub.order.Comanda;
import edu.poniperro.galleygrub.order.Order;

/* import edu.poniperro.galleygrub.extras.CheeseExtra;
import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.extras.Regular;
import edu.poniperro.galleygrub.extras.SauceExtra;
import edu.poniperro.galleygrub.extras.SizeLargeExtra; */

public class ReceiptTest {

    Receipt receipt;
    Order order;
    //Extra cheese;
    
    @Before
    public void setup_receipt() {

        order = new Order();

        order.addItem("Krabby Patty", 1.25, "cheese");
        order.addItem("Coral Bits", 1.00, "medium"); // si definir medium
        order.addItem("Kelp Rings", 1.50, "sauce");
        order.addItem("Golden Loaf", 2.00, "sauce");
        order.addItem("Seafoam Soda", 1.00, "large");
        order.addItem("Coral Bits", 1.00, "large");

        receipt = new Receipt(order);
    }

    // integracion receipt con un Extra
    @Test
    public void sum_extra_cheese_test() {
        
        Comanda savedOrder = receipt.getOrder();
        assertNotNull(savedOrder);
        assertEquals(0d, savedOrder.getTotal(), 0d);
    }
}