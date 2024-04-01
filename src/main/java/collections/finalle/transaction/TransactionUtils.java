package collections.finalle.transaction;

import java.util.Random;

public class TransactionUtils {



    public BigDecimal transactions( Long numbOfTransactions) {
        BigDecimal amount = new BigDecimal();
        Random random = new Random();
        int i = 0;


        while (i < numbOfTransactions.getQuantityTransaction()) {
            int transaction = random.nextInt(100000) - 50000;
            int asd = amount.getAmount();
            amount.setAmount(asd + transaction);

            i++;
        }
        return amount;
    }

}
