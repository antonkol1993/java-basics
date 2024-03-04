package collections.map;


public class ChatUtils {






    private static int stringsQuantity() {
        dialogSplit();
        return dialogSplit().length;
    }

    private static String[] dialogSplit() {
        return ChatIssue.getSomeDialog().split("\\n");
    }


    public static String[] nameList() {
        dialogSplit();
        String[] nameList = new String[dialogSplit().length];
        for (int i = 0; i < nameList.length; i++) {
            String name = dialogSplit()[i].split(":")[0];
            nameList[i] = name;
        }
        return nameList;
    }


    public static Integer[] wordsQuantity() {
        dialogSplit();
        Integer[] quantityWordsInString = new Integer[dialogSplit().length];
        for (int j = 0; j < dialogSplit().length; j++) {

            String[] subString = dialogSplit()[j].split(" ");
            int quantityWords = subString.length - 1;

            quantityWordsInString[j] = quantityWords;
        }
        return quantityWordsInString;
    }







//    public static List<String> getTopChatter(String dialog, int users) {
//        List<String> adsadsads = null;
//
//        for (int i = 0; i < stringsQuantity(); i++) {
//            Integer integrewer = 0;
//            for (int j = stringsQuantity() - 1; j >= 0; j--) {
//
//
//                    if (Objects.equals(nameList()[i], nameList()[j]) && j > i) {
//                        integrewer += wordsQuantity()[j] + wordsQuantity()[i];
//
//                        wordsQuantity()[j] = 0;
//                        nameList()[j] = "";
//
//                    }
//
//            }
//            if (nameList()[i] != "" && wordsQuantity()[i] != 0) {
//                adsadsads = List.of(nameList()[i], integrewer.toString()
//                );
//            }
//
//        }
//
//        return adsadsads;
//    }


    //     String[] words = ChatIssue.someDialog.split("\\n");


//          System.out.println(nameList[j]);
//          System.out.println(quantityWordsInString[j]);



}
//}
