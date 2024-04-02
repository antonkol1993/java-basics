package collections.finalle.transaction;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Long vasya = new Long("Vasya", 12);
        Long petya = new Long("Petya", 45);
        Long masha = new Long("masha", 100);
        Long dasha = new Long("dasha", 220);
        Long vitya = new Long("vitya", 59);
        Long sveta = new Long("sveta", 3);
        Long griwa = new Long("griwa", 0);
        System.out.println(vasya.getPersonId());
        System.out.println(petya.getPersonId());
        System.out.println(masha.getPersonId());
        System.out.println(dasha.getPersonId());
        System.out.println(vitya.getPersonId());
        System.out.println(sveta.getPersonId());
        System.out.println(griwa.getPersonId());

        System.out.println();

        TransactionUtils transactionUtils = new TransactionUtils();
        System.out.println(transactionUtils.transactions(vasya));
        System.out.println(transactionUtils.transactions(petya));
        System.out.println(transactionUtils.transactions(masha));
        System.out.println(transactionUtils.transactions(dasha));
        System.out.println(transactionUtils.transactions(vitya));
        System.out.println(transactionUtils.transactions(sveta));
        System.out.println(transactionUtils.transactions(griwa));

        System.out.println();

        System.out.println(transactionUtils.startAmount(vasya));
        System.out.println(transactionUtils.startAmount(petya));
        System.out.println(transactionUtils.startAmount(griwa));
        System.out.println();

        TreeMap<Long, Object> objectObjectTreeMap = new TreeMap<>();


        transactionUtils.transactions(vasya);

    }

}
