package collections.finalle.transaction;

import java.math.BigDecimal;

public class Long {
    private  int personId;
    private  String name;
    private  int quantityTransaction;
    private BigDecimal amount;

    public Long(String name, int quantityTransaction) {
        this.quantityTransaction = quantityTransaction;
        this.personId = hashCode();
        this.name = name;

    }

    public Long() {
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

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Long{");
        sb.append("personId=").append(personId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", quantityTransaction=").append(quantityTransaction);
        sb.append(", amount=").append(amount);
        sb.append('}');
        return sb.toString();
    }
}
