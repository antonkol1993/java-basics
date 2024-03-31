package map;


import java.util.*;
import java.util.stream.Collectors;

public class ChatIssue {


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
    public List<String> getTopChatter(String dialog, int users) {
        String[] lines = dialog.split("\\n");

        Map<String, Integer> authorsMap = new HashMap<>();
        for (int i = 0; i < lines.length; i++) {
            //name
            String[] split = lines[i].split(":");

            String name = split[0];
//            namesList[i] = name;

            //count
            int quantityWords = split[1].trim().split(" +").length - 1;
//            wordsCountList[i] = quantityWords;

            //map
//            if (authorsMap.containsKey(namesList[i])) {
//                authorsMap.put(namesList[i], authorsMap.get(namesList[i]) + wordsCountList[i]);
//            } else{
//                authorsMap.put(namesList[i], wordsCountList[i]);
//            }


//            authorsMap.compute();
//            authorsMap.computeIfAbsent();
//            authorsMap.computeIfPresent();

//            authorsList.computeIfAbsent()

            authorsMap.putIfAbsent(name, quantityWords);

            authorsMap.computeIfPresent(name, (k, v) -> v + quantityWords);

//            authorsMap.compute(name, (k, v) -> quantityWords + (v == null ? 0 : v));
        }

//        Comparator<Integer> tComparator = Comparator.naturalOrder();
//        Comparator<Integer> reversed = tComparator.reversed();


        System.out.println(authorsMap);

        Map<String, Integer> collect = authorsMap
                .entrySet()
                .stream()
                .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                .limit(users)
//                .sorted()
                .sorted((c1, c2) -> c1.getKey().compareTo(c2.getKey()))
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
