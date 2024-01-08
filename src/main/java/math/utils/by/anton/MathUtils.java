package math.utils.by.anton;



public class MathUtils {

    private long result;
    private int index;

    public MathUtils(long result, int index) {
        this.result = result;
        this.index = index;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


    public static long factorial(int indexFactorial) {

        long result = 1;
        if (indexFactorial < 0) {
            throw new RuntimeException("Factorial has only positive numbers ! ");
        } else {
            if ( indexFactorial == 0 ) {
                return result;
            }
            for (int i = 1; i <= indexFactorial; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.factorial(0));
    }


    public static long fibonacci(int index) {
        index -= 1;
        if (index < 3) {
            return index;
        } else {
            long a = 0;
            long b = 1;
            for (int i = 2; i <= index; i++) {
                long c = a + b;
                a = b;
                b = c;

                if (i == index) {
                    return c;
                }
            }
            return b;
        }
    }


}
