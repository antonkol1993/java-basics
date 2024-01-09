package cardboard.by.anton;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CardboardTest {


    @ParameterizedTest
    @CsvSource(value = {
            "1,3,5",
            "2,5,10",
            "10,1,20",
            "32,22,35",
            "5,1,8",
    })
    public void cardboardOnBooleanFalseTest(int lengthCardboard, int heightCardboard, int radiusCircle) {
        Cardboard.setHeightCardboard(heightCardboard);
        Cardboard.setLengthCardboard(lengthCardboard);
        Cardboard.setRadiusCircle(radiusCircle);

        assertFalse(Cardboard.isCardboardClosed());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "5,3,5",
            "4,5,6",
            "10,1,2",
            "25,22,25",
            "10,1,1",
    })
    public void testCardboardOnBooleanTrue(int lengthCardboard, int heightCardboard, int radiusCircle) {
        Cardboard.setHeightCardboard(heightCardboard);
        Cardboard.setLengthCardboard(lengthCardboard);
        Cardboard.setRadiusCircle(radiusCircle);

        assertTrue(Cardboard.isCardboardClosed());

    }

    @ParameterizedTest
    @CsvSource(value = {
            "0,3,5",
            "4,-1,6",
            "10,1,-3",
            "25,22,0",
            "-5,0,0",
    })
    public void testExceptedExceptionToCardboard(int lengthCardboard, int heightCardboard, int radiusCircle) {
        Cardboard.setHeightCardboard(heightCardboard);
        Cardboard.setLengthCardboard(lengthCardboard);
        Cardboard.setRadiusCircle(radiusCircle);

        assertThrows (RuntimeException.class, Cardboard::isCardboardClosed);
    }




}