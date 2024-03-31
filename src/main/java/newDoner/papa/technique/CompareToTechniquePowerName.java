package newDoner.papa.technique;

import java.util.Comparator;

public class CompareToTechniquePowerName implements Comparator <AbstractTechnique>{


    @Override
    public int compare(AbstractTechnique o1, AbstractTechnique o2) {
        return Integer.compare(o1.getPowerConsumption(), o2.getPowerConsumption());
    }



}


