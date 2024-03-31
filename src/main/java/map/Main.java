package map;

public class Main {

    public static void main(String[] args) {


        ChatUtils chatUtils = new ChatUtils();

        System.out.println(ChatIssue.getSomeDialog());

        System.out.println();

//        System.out.println(ChatUtils.sort());
        System.out.println(chatUtils.authorsList(new String[]{ChatIssue.getSomeDialog()}));


    }
}
