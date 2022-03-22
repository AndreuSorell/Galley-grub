package edu.poniperro.galleygrub.extras;
import java.util.List;
import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE = 0.50;

    public SauceExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        List<Item> items = order.itemList();
        for (Item item : items) {
            if (item.extra() == SAUCE) {
                order.updateTotal(SAUCE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(order));
    }
    
}
