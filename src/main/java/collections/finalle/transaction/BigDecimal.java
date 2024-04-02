package collections.finalle.transaction;

import java.util.Random;

public class BigDecimal {

    private int amount;


    public BigDecimal(int amount) {
        this.amount = amount;
    }

    public BigDecimal() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{" + amount +
                '}';
    }
}
