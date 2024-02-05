package papa.Doner;

import papa.Doner.doners.DonerChicken;
import papa.Doner.doners.DonerRaffleTasty;

public class Main {

    public static void main(String[] args) {


        DonerChicken donerChicken = new DonerChicken(5);
        System.out.println(donerChicken.getTotalWeight().getDonerChickenWeight());
        System.out.println(donerChicken.getTotalCost().getDonerChickenCost());






    }
}
