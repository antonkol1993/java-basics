package collections.finalle.transaction;

import java.math.BigDecimal;
import java.util.StringJoiner;

public class Transaction {
    private final String person; // обычно это на контакт, я упростил, заменив ее на ключ (id)
    private java.math.BigDecimal amount;


    public Transaction(String person, BigDecimal amount) {
        this.person = person;
        this.amount = amount;
    }

    public String getPerson() {
        return person;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Transaction.class.getSimpleName() + "[", "]")
                .add("person='" + person + "'")
                .add("amount=" + amount)
                .toString();
    }
}

