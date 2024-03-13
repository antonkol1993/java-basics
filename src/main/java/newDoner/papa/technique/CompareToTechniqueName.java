package newDoner.papa.technique;

import newDoner.papa.technique.AbstractTechnique;

import java.util.Comparator;

public class CompareToTechniqueName implements Comparator <AbstractTechnique>{


    @Override
    public int compare(AbstractTechnique o1, AbstractTechnique o2) {

        return o1.getName().compareTo(o2.getName());
    }



}


