package collections.finalle.transaction;

import java.util.Random;

public class BigDecimal {
    Random random = new Random();
    Long name;
    private int amount;



    public BigDecimal() {
        this.amount = random.nextInt(100000 ) - 50000;
        if (amount == 0) {
            do {
                this.amount = random.nextInt(100000) - 50000;
            } while (amount == 0);
        }
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
