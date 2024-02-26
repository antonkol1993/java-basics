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
        System.out.println(ChatIssue.someDialog.split(" ").length);
        String [] words = ChatIssue.someDialog.split("[(^A-Z)?+($: )]");
        for (String word : words) {
            System.out.print(word + "& ");
        }
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
