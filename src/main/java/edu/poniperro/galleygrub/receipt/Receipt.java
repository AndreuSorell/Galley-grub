package edu.poniperro.galleygrub.receipt;

import edu.poniperro.galleygrub.order.Comanda;

public class Receipt implements Ticket {
    private Double total = 0d;
    private Comanda order;

    public Receipt(Comanda order) {
        this.order = order;
    }

    @Override
    public Comanda getOrder() {
        return this.order;
    }

    @Override
    public Double total() {
        return this.total;
    }

    @Override
    public void sumExtrasCharge() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void print() {
        getOrder().display();
        System.out.println("\tTOTAL--------> " + total() + "$");      
    }
    
}
