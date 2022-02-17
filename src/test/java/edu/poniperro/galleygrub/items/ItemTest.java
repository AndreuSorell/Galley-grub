package edu.poniperro.galleygrub.items;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemTest {
    
    @Test
    public void constructorTest() {
        Product patty = new Item("Krabby Patty", 1.25);
        assertEquals("Krabby Patty", patty.name());
        assertEquals(1.25, patty.price(), 0);
        assertEquals("", patty.extra());
    }
}
