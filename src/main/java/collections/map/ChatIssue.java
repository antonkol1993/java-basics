package collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

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
    public static List<String> getTopChatter(String dialog, int users) {
        return List.of();
    }

    public static String getSomeDialog() {
        return someDialog;
    }
}
