package collections.map;


import java.util.*;

public class ChatUtils {

    List<ChatUtils> chatUtilsList;


    private static int stringsQuantity() {
        dialogSplit();
        return dialogSplit().length;
    }

    private static String[] dialogSplit() {
        return ChatIssue.getSomeDialog().split("\\n");
    }


    public static String[] nameList() {
        dialogSplit();
        String[] nameList = new String[dialogSplit().length];
        for (int i = 0; i < nameList.length; i++) {
            String name = dialogSplit()[i].split(":")[0];
            nameList[i] = name;
        }
        return nameList;
    }


    public static Integer[] wordsQuantity() {
        dialogSplit();
        Integer[] quantityWordsInString = new Integer[dialogSplit().length];
        for (int j = 0; j < dialogSplit().length; j++) {

            String[] subString = dialogSplit()[j].split(" ");
            int quantityWords = subString.length - 1;

            quantityWordsInString[j] = quantityWords;
        }
        return quantityWordsInString;
    }

    public static Map<String, Integer> authorsList() {
        Map<String, Integer> authorsList = new HashMap<>();
        for (int i = 0; i < dialogSplit().length; i++) {
            if (authorsList.containsKey(nameList()[i])) {
                authorsList.put(nameList()[i], authorsList.get(nameList()[i]) + wordsQuantity()[i]);
            } else authorsList.put(nameList()[i], wordsQuantity()[i]);
        }

        return authorsList;
    }

    public static Map<String, Integer> sort() {
        Map<String, Integer> authorsList = authorsList();

        Integer[] quantity = new Integer[authorsList().size()];
        String[] name = new String[authorsList().size()];
        for (int i = 0; i < quantity.length; i++) {
            name[i] = authorsList.get()
                    quantity[i] =
        }

        return authorsList;
    }


}
//}
