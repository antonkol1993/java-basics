package collections.finalle.transaction;

public class Transaction {
    private final Long personId; // обычно это на контакт, я упростил, заменив ее на ключ (id)
    private  BigDecimal amount;


    public Transaction(Long personId, BigDecimal amount) {
        this.personId = personId;
        this.amount = amount;
    }

    public Long getPersonId() {
        return personId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

}

