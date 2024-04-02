package com.point.hw.papa;


import com.point.hw.papa.complex.food.AbstractFood;
import com.point.hw.papa.technique.AbstractTechnique;
import com.point.hw.papa.technique.CompareToTechniqueName;
import com.point.hw.papa.technique.CompareToTechniquePowerName;
import com.point.hw.papa.allfoodcompare.ComparatorFoodPriceName;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

        System.out.println(TechniqueUtils.allTechniqueList());
        System.out.println();
        CompareToTechniqueName compareToTechniqueName = new CompareToTechniqueName();
        TreeSet<AbstractTechnique> abstractTechniques = new TreeSet<>(compareToTechniqueName);
        abstractTechniques.addAll(TechniqueUtils.allTechniqueList());
        System.out.println(abstractTechniques);

        Comparator<AbstractTechnique> abstractTechniqueComparator =
                new CompareToTechniqueName().thenComparing(new CompareToTechniquePowerName());


        List<AbstractFood> abstractFoods = FoodUtils.allFood();
        ComparatorFoodPriceName comparatorFoodPriceName = new ComparatorFoodPriceName();
        abstractFoods.sort(comparatorFoodPriceName);

//        Collections.<AbstractFood>sort(abstractFoods); // Comparable!!!
        Collections.sort(abstractFoods, comparatorFoodPriceName);

        System.out.println(abstractFoods);


    }

}