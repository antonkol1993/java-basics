package collections.map;


import java.util.ArrayList;
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
        Integer[] wordsCountList = new Integer[lines.length];
        Map<String, Integer> authorsMap = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            //name
            String[] split = lines[i].split(":");
            String name = split[0];
            namesList[i] = name;

            //count
            String[] subString = split[1].trim().split(" +");
            int quantityWords = subString.length - 1;
            wordsCountList[i] = quantityWords;

            //map
            if (authorsMap.containsKey(namesList[i])) {
                authorsMap.put(namesList[i], authorsMap.get(namesList[i]) + wordsCountList[i]);
            } else{
                authorsMap.put(namesList[i], wordsCountList[i]);
            }


//            authorsList.computeIfAbsent()

//            authorsMap.putIfAbsent(name, quantityWords);
//            authorsMap.computeIfPresent(name, (k, v) -> v + quantityWords);

//            authorsMap.compute(name, (k, v) -> quantityWords + (v == null ? 0 : v));
        }


        Map<String, Integer> collect = authorsMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
//                .limit(users)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));


        return new ArrayList<>(collect.keySet());
    }

    public static String getSomeDialog() {
        return someDialog;
    }
}
