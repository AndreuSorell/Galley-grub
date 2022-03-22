package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE = 0.25;

    public CheeseExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        List<Item> items = order.itemList();
        for (Item item : items) {
            if (item.extra() == CHEESE) {
                order.updateTotal(CHEESE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(order));
    }
    
}
