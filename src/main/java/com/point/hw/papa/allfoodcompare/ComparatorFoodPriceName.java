package com.point.hw.papa.allfoodcompare;

import com.point.hw.papa.complex.food.AbstractFood;

import java.util.Comparator;

public class ComparatorFoodPriceName implements Comparator<AbstractFood> {

    @Override
    public int compare(AbstractFood o1, AbstractFood o2) {
        if ( (int)o1.getPrice() == (int)o2.getPrice()) {
            return o1.getName().compareTo(o2.getName());
        }


        return (int) (o2.getPrice() - o1.getPrice());
    }

}
