package map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ChatUtils {


    private String[] dialogSplit(String dialog) {
        return dialog.split("\\n");
    }


    public String[] nameList(String[] dialogSplit) {
        String[] nameList = new String[dialogSplit.length];
        for (int i = 0; i < nameList.length; i++) {
            String name = dialogSplit[i].split(":")[0];
            nameList[i] = name;
        }
        return nameList;
    }


    public Integer[] wordsQuantity(String[] dialogSplit) {
        Integer[] quantityWordsInString = new Integer[dialogSplit.length];
        for (int j = 0; j < dialogSplit.length; j++) {

            String[] subString = dialogSplit[j].split(" ");
            int quantityWords = subString.length - 1;

            quantityWordsInString[j] = quantityWords;
        }
        return quantityWordsInString;
    }

    public Map<String, Integer> authorsList(String[] dialogSplit) {
        Map<String, Integer> authorsList = new HashMap<>();
        for (int i = 0; i < dialogSplit.length; i++) {
            if (authorsList.containsKey(nameList(dialogSplit)[i])) {
                authorsList.put(nameList(dialogSplit)[i], authorsList.get(nameList(dialogSplit)[i]) + wordsQuantity(dialogSplit)[i]);
            } else authorsList.put(nameList(dialogSplit)[i], wordsQuantity(dialogSplit)[i]);
        }

        return authorsList;
    }

    public Map<String, Integer> sort(String[] dialogSplit) {
        return authorsList(dialogSplit).entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
    }


}

