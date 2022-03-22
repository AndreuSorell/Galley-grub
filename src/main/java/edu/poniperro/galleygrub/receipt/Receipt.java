package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.extras.Extra;
import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total = 0d;
    private Comanda order;
    private Extra firstExtra;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        this.sumExtrasCharge();
        total = getOrder().getTotal();
        return this.total;
    }

    @Override
    public void setChain(Extra extra) {
        firstExtra = extra;
    }

    @Override
    public Extra getChain() {
        return firstExtra;
    }
    
    @Override
    public void sumExtrasCharge() {
        if (getChain() != null) {
            getChain().sumExtras(getOrder());
        }
    }

    @Override
    public void print() {
        getOrder().display();
        System.out.println("\tTOTAL--------> " + total() + "$");      
    }

}
