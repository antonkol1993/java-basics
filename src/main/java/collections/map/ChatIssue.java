package collections.map;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ChatIssue {


    private static final String someDialog =
            """
                    Alex: Hi people
                    Boris: Hello Alex
                    July: Hi sweaty Alex
                    James: Hi Alex! How are you?
                    Alex: I am fine. And you?
                    James II: Good! Thank you!
                    """;


    // 1 -> James
    // 2 -> James Alex
    // 4 -> James Alex July Boris
    public List<String> getTopChatter(String dialog, int users) {
        String[] lines = dialog.split("\\n");

        String[] namesList = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            String name = lines[i].split(":")[0];
            namesList[i] = name;
        }


        Integer[] wordsCountList = new Integer[lines.length];
        for (int j = 0; j < lines.length; j++) {

            String[] subString = lines[j].split(" ");
            int quantityWords = subString.length - 1;

            wordsCountList[j] = quantityWords;
        }

        Map<String, Integer> authorsList = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            if (authorsList.containsKey(namesList[i])) {
                authorsList.put(namesList[i], authorsList.get(namesList[i]) + wordsCountList[i]);
            } else{
                authorsList.put(namesList[i], wordsCountList[i]);
            }
        }

        Map<String, Integer> collect = authorsList
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        return List.of();
    }

    public static String getSomeDialog() {
        return someDialog;
    }
}
