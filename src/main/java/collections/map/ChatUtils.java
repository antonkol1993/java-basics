package collections.map;

public class ChatUtils {



     public static String[] nameList() {
          String[] words = ChatIssue.getSomeDialog().split("\\n");
          String [] nameList = new String[words.length];
         for (int i = 0; i < nameList.length; i++) {
             String word = words[i];
             String name = word.split(":")[0];

             nameList[i] = name;
         }
          return nameList ;
     }


     public static int [] quantity() {
         String[] words = ChatIssue.getSomeDialog().split("\\n");
         int [] quantityWordsInString = new int [words.length];
         for (int j = 0; j<words.length; j++) {

             String word = words[j];
             String[] subString = word.split(" ");
             int quantityWords = subString.length - 1;

             quantityWordsInString[j] = quantityWords;
         }
         return quantityWordsInString;
     }

//     String[] words = ChatIssue.someDialog.split("\\n");






//          System.out.println(nameList[j]);
//          System.out.println(quantityWordsInString[j]);

     }




//}
