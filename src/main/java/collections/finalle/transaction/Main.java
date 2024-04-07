package collections.finalle.transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();

        List<String> persons = List.of("Vasya", "Petya", "Masha", "Kolya", "Sidor", "Sifon");
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            Transaction transaction = new Transaction(persons.get(random.nextInt(6)), new BigDecimal(random.nextInt(-50000, 50001)));
            transactions.add(transaction);
        }
        transactions.forEach(transaction -> System.out.println(transaction));


//        for (int i = 0; i < persons.size(); i++) {
//            System.out.println(persons.get);
//        }
        HashMap<String, BigDecimal> objectObjectHashMap = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            Transaction transaction = transactions.get(i);
            objectObjectHashMap.putIfAbsent(transaction.getPerson(), transaction.getAmount());
            objectObjectHashMap.computeIfPresent(transaction.getPerson(), (k,v)-> v.add(transaction.getAmount()));
        }

        System.out.println(objectObjectHashMap);

    }

}
