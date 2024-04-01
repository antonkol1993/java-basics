package collections.finalle.transaction;

public class Long {
    private final int personId;
    private final String name;
    private final int quantityTransaction;
    private BigDecimal amount;

    public Long(String name, int quantityTransaction) {
        this.quantityTransaction = quantityTransaction;
        this.personId = hashCode();
        this.name = name;
        amount = new BigDecimal();
    }


    public void setAmount(int amount) {
        this.amount = amount;
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

    public BigDecimal getAmount() {
        return amount;
    }


}
