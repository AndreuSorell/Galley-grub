package edu.poniperro.galleygrub.receipt;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.poniperro.galleygrub.order.Comanda;
import edu.poniperro.galleygrub.order.Order;

public class ReceiptTest {
    private Ticket receipt;
    private Comanda order;
    @Before
    public void setupReceipt() {
        order = new Order();
        receipt = new Receipt(order);
    }
    
    @Test
    public void constructorTest() {
        assertNotNull("receipt creada", receipt);
    }

    @Test
    public void totalTest() {
        assertEquals(0.0, receipt.total(), 0);
    }

    @Test
    public void getOrderTest() {
        assertEquals(order, receipt.getOrder());
    }
}
