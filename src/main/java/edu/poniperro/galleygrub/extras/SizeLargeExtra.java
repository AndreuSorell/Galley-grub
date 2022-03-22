package edu.poniperro.galleygrub.extras;
import java.util.List;
import edu.poniperro.galleygrub.items.Item;
import edu.poniperro.galleygrub.order.Comanda;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE = 0.50;

    public SizeLargeExtra() {
    }

    @Override
    public void sumExtras(Comanda order) {
        List<Item> items = order.itemList();
        for (Item item : items) {
            if (item.extra() == SIZE_LARGE) {
                order.updateTotal(SIZE_PRICE);
            }
        }
        nextExtra.ifPresent(extra -> nextExtra.get().sumExtras(order));
    }
    
}
