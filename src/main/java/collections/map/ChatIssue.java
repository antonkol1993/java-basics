package collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ChatIssue {


//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(ChatIssue.someDialog.substring("^: ")));

//        System.out.println(ChatIssue.someDialog);
//        String[] words = ChatIssue.someDialog.split("\\n");
//
//        String [] nameList = new String[words.length];
//        int [] quantityWordsInString = new int [words.length];
//
//        for (int j = 0; j<words.length; j++) {
//            String word = words[j];
//            String name = word.split(":")[0];
//
//            nameList[j] = name;
//
//            String []subString = word.split(" ");
//            int quantityWords = subString.length - 1;
//
//            quantityWordsInString[j] = quantityWords;
//
//            System.out.println(nameList[j]);
//            System.out.println(quantityWordsInString[j]);
//
//        }
//           List<String> listNames;
//           List<Integer> listQuantity;
//
//        for (int i = 0; i<words.length; i++) {
//            for (int k = words.length - 1; k > i; k--) {
//                if (nameList[i].equalsIgnoreCase(nameList[k])) {
//                    if (quantityWordsInString[i] == 0) {
//                        continue;
//                    }
//                    quantityWordsInString[i] = quantityWordsInString[i] + quantityWordsInString[k];
//                    quantityWordsInString[k] = 0;
//                    nameList[k] = "";
//
//
//                }
//
//            }
//        }
//
//
//        ;
//
//
//        System.out.println();
//
//        for (int j = 0; j<words.length; j++) {
//            System.out.println(nameList[j]);
//            System.out.println(quantityWordsInString[j]);
//            if (quantityWordsInString[j] !=0) {
//                List<>
//            }
//        }
//
//
//
//    }

//    public ChatIssue() {
//    }

    private static final String someDialog =
            """
                    Alex: Hi people
                    Boris: Hello Alex
                    July: Hi sweaty Alex
                    James: Hi Alex! How are you?
                    Alex: I am fine. And you?
                    James: Good! Thank you!
                    """;





    // 1 -> James
    // 2 -> James Alex
    // 4 -> James Alex July Boris
    public static List<String> getTopChatter(String dialog, int users) {
        return List.of();
    }

    public static String getSomeDialog() {
        return someDialog;
    }
}
