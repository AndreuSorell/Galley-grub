package edu.poniperro.galleygrub.extras;

import java.util.List;

import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class Regular extends Extra {

    public Regular() {
    }

    @Override
    public void sumExtras(Comanda order) {
        List<Item> items = order.itemList();
        for (Item item : items) {
            order.updateTotal(item.price());
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(order));
    }
    
}
