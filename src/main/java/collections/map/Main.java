package collections.map;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

            System.out.println(Arrays.toString(ChatUtils.nameList()));

        System.out.println(Arrays.toString(ChatUtils.wordsQuantity()));

        Integer [] arr;
        arr = ChatUtils.wordsQuantity();
        Arrays.sort(arr,Collections.reverseOrder());;
        Arrays.sort(ChatUtils.wordsQuantity());

            System.out.print(Arrays.toString(arr) + " ");



//        System.out.println(ChatUtils.getTopChatter("asddas", 45));
    }
}
