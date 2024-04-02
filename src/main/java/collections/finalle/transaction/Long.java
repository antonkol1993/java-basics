package collections.finalle.transaction;

public class Long {
    private final int personId;
    private final String name;
    private final int quantityTransaction;


    public Long(String name, int quantityTransaction) {
        this.quantityTransaction = quantityTransaction;
        this.personId = hashCode();
        this.name = name;

    }




    public int getQuantityTransaction() {
        return quantityTransaction;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }




}
