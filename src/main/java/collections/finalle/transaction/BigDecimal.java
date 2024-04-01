package collections.finalle.transaction;

import java.util.Random;

public class BigDecimal {
    Random random = new Random();
    private int amount;



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
        final StringBuilder sb = new StringBuilder("BigDecimal{");
        sb.append("amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
