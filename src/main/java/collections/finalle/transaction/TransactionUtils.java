package collections.finalle.transaction;

import java.util.*;

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


    public static Map <Integer, BigDecimal> asdsa () {

        Long vasya = new Long("Vasya", 12);
        Long petya = new Long("Petya", 45);
        Long masha = new Long("masha", 100);
        Long dasha = new Long("dasha", 220);
        Long vitya = new Long("vitya", 59);
        Long sveta = new Long("sveta", 3);
        Long griwa = new Long("griwa", 2);

        TransactionUtils transactionUtils = new TransactionUtils();
        Map <Integer,BigDecimal> hashMap = new HashMap<>();
        hashMap.put(vasya.getPersonId(),transactionUtils.transactions(vasya));
        hashMap.put(petya.getPersonId(),transactionUtils.transactions(petya));
        hashMap.put(masha.getPersonId(),transactionUtils.transactions(masha));
        hashMap.put(dasha.getPersonId(),transactionUtils.transactions(dasha));
        hashMap.put(vitya.getPersonId(),transactionUtils.transactions(vitya));
        hashMap.put(sveta.getPersonId(),transactionUtils.transactions(sveta));
        hashMap.put(griwa.getPersonId(),transactionUtils.transactions(griwa));


        return hashMap;
    }



}
