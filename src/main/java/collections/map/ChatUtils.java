package collections.map;


import java.util.*;
import java.util.stream.Collectors;

public class ChatUtils {


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
        return authorsList().entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }


}
//}
