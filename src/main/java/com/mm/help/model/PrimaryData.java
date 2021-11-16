package main.java.com.mm.help.model;

import java.math.BigDecimal;

public class PrimaryData {

    private BigDecimal initialSum;
    private BigDecimal initialQuantity;

    public BigDecimal getInitialSum() {
        return initialSum;
    }

    public void setInitialSum(String initialSum) {
        this.initialSum = BigDecimal.valueOf(Double.parseDouble(initialSum));
    }

    public BigDecimal getInitialQuantity() {
        return initialQuantity;
    }

    public void setInitialQuantity(String initialQuantity) {
        this.initialQuantity = BigDecimal.valueOf(Double.parseDouble(initialQuantity));
    }
}
