package collections.finalle.transaction;

import java.util.Random;

public class TransactionUtils {
    Random random = new Random();
    public int startAmountPerson (Long person) {
        int x = random.nextInt(100000 ) - 50000;
        if (x == 0) {
            do {
                x = random.nextInt(100000) - 50000;
            } while (x == 0);
            person.setAmount(x);
        }
        return person.getAmount();
    }

    public int transactions(Long person) {


        int i = 0;


        while (i < person.getQuantityTransaction()) {
            int transaction = random.nextInt(100000) - 50000;
            int asd = per
            person.setAmount(asd + transaction);

            i++;
        }
        return amount.getAmount();
    }

}
