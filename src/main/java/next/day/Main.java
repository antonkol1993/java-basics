package next.day;

import java.time.Month;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Month january = Month.JANUARY;

        List<Month> day31 = List.of(Month.JANUARY, Month.MARCH, Month.MAY, Month.JULY);

        String imageContentResource = "https://papadoner.by/resource/images/2022/07/doner-bekon-42x.webp";
        String imageTitleResource = "https://papadoner.by/resource/images/2021/01/sizebig-typedoner-bekon.png";
        System.out.println("all kebas:");
        System.out.println("- doner kebab bbq (lepeshka, kurica, chili perec)\n- doner king\n- doner cheese");
        System.out.println();
        System.out.println("Kurica:");
        System.out.println("- doner kebab bbq\n- doner king\n- doner cheese");
        System.out.println();
        System.out.println("Grubi:");
        System.out.println("- doner kebab bbq\n- doner king\n- doner cheese");
        System.out.println();
        System.out.println("Grubi + CHeese:");
        System.out.println("- doner kebab bbq\n- doner king\n- doner cheese");
        

    }
}
