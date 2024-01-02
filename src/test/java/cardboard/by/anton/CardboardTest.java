package cardboard.by.anton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CardboardTest {


    @ParameterizedTest
    @CsvSource(value = {
            "2,3,5",
            "4,5,-8",
            "-1,1,2",
            "32,22,50",
            "0,0,0",

    })
    void cardboardTest(int lengthCardboard, int heightCardboard, int radiusCircle) {
        Cardboard cardboard = new Cardboard(lengthCardboard, heightCardboard, radiusCircle);
        int differenceTest = (int) (Math.pow(radiusCircle, 2) - (Math.pow(lengthCardboard, 2) + Math.pow(heightCardboard, 2)));
        boolean isCardboard = !(differenceTest >= 0);
        Assertions.assertEquals(isCardboard, cardboard.isCardboardClosed());
//        Assertions.assertTrue(cardboard.isCardboardClosed(board, radius));
//        Assertions.assertFalse(cardboard.isCardboardClosed(board, radius));
    }


}