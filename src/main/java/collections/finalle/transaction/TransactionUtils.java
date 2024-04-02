package collections.finalle.transaction;

import java.util.Random;

public class TransactionUtils {
    Random random = new Random();

    public int startAmount (Long person) {
        BigDecimal bigDecimal = new BigDecimal();
        int x = random.nextInt(100000) - 50000;
        if (x == 0) do {
            x = random.nextInt(100000) - 50000;
        } while (x == 0);
        bigDecimal.setAmount(x);
        return bigDecimal.getAmount();
    }

    public BigDecimal transactions(Long person) {


        int i = 0;
        int asd = 0;

        while (i < person.getQuantityTransaction()) {
            int transaction = random.nextInt(100000) - 50000;
            asd += transaction;
            i++;

        }
        return new BigDecimal(startAmount(person) + asd);
    }

}
