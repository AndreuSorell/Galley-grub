package edu.poniperro.galleygrub.extras;

import java.util.Optional;

import edu.poniperro.galleygrub.order.Comanda;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct = "";
    Optional<Extra> nextExtra = Optional.empty();
    
    public Extra() {
    }

    public void setNextExtra(Extra nextExtra) {
        this.nextExtra = Optional.ofNullable(nextExtra);
    }

    public abstract void sumExtras(Comanda order);
}
