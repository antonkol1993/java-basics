import collections.map.ChatIssue;

public class Main {
    public static void main(String[] args) {


          String someDialog =
                """
                        Alex: Hi people
                        Boris: Hello Alex
                        July: Hi sweaty Alex
                        James: Hi Alex! How are you?
                        Alex: I am fine. And you?
                        James: Good! Thank you!
                        """;



            String[] words = someDialog.split(":");
            for (String word : words) {
                System.out.print(word + "& ");

            }
            String withoutColon = "";
            for (int i = 0; i < words.length; i++) {
                withoutColon += words;
            }

            System.out.println(withoutColon);




    }
}
