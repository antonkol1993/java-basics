package math.utils.by.anton;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Object[]> asdads = Arrays.asList(new Object[][] {
                { 5, 3L },
                { 6, 5L },
                { 11, 55L },
                { 12, 89L },
                { 13, 145L },
        });
        System.out.println(asdads.size());
        System.out.println(Arrays.toString(asdads.get(2)));
        Object [][] numbersCopy = new Object[][]{Arrays.copyOf(new List[]{asdads}, 0)};
        System.out.println(Arrays.deepToString(numbersCopy));

        MathUtils mathUtils = new MathUtils(8, 7);
        MathUtils mathUtils2 = new MathUtils(13, 8);



    }
}

