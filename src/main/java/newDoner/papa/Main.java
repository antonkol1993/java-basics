package newDoner.papa;


import newDoner.papa.technique.AbstractTechnique;
import newDoner.papa.technique.CompareToTechniquePrice;

import java.util.List;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {

//        System.out.println(TechniqueUtils.allTechniqueList());
        System.out.println();
        CompareToTechniquePrice compareToTechniquePrice = new CompareToTechniquePrice();
        TreeSet<AbstractTechnique> sorted = new TreeSet<>(compareToTechniquePrice);
        for ()

        System.out.println(sorted);
//        System.out.println(Filters.allClassInstances);


    }

}