package collections.map;

import java.util.Arrays;
import java.util.List;

public class ChatIssue {

    @Override
    public String toString() {

        return toString();
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(ChatIssue.someDialog.substring("^: ")));

        String [] words = ChatIssue.someDialog.split(":");
        for (String word : words) {
            System.out.print(word + "& ");

        }
            String withoutColon = null;
        for (int i = 0; i < words.length; i++) {
            withoutColon += words;
        }

        String a;
        a = withoutColon;
        System.out.println(a);


    }



    private static String someDialog =
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
