package com.point.hw.papa.technique;

import java.util.Comparator;

public class CompareToTechniqueName implements Comparator<AbstractTechnique> {

    @Override
    public int compare(AbstractTechnique o1, AbstractTechnique o2) {
        return o1.getName().compareTo(o2.getName());
    }


}
