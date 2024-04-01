package collections.finalle.transaction;

public class Main {
    public static void main(String[] args) {

        Long vasya = new Long("Vasya", 12);
        Long petya = new Long("Petya", 250);
        System.out.println(vasya.getPersonId());
        System.out.println(petya.getPersonId());

        System.out.println(vasya.getAmount());
        TransactionUtils transactionUtils = new TransactionUtils();
        transactionUtils.transactions(vasya);
    }

}
