package newDoner.papa.technique;

import java.util.Comparator;

public class CompareToTechniquePriceName implements Comparator<AbstractTechnique> {


    @Override
    public int compare(AbstractTechnique o1, AbstractTechnique o2) {
        int obj1 = (int) o1.getPrice();
        int obj2 = (int) o2.getPrice();

        if (o1.getPrice() == o2.getPrice()
        ) {

            return o1.getName().compareTo(o2.getName());
        }

        return obj1 - obj2;
    }
}

