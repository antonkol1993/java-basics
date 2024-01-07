package math.utils.by.anton;

import java.util.ArrayList;
import java.util.List;

public class MathUtils {

    private long result;
    private int index;

    public MathUtils(long result, int index) {
        this.result = result;
        this.index = index;
    }


    static List<Long> arr = new ArrayList<>();


    public static void fibonacciNumbersThirtyElements() {
        for (int i = 0; i < 30; i++) {
            if (i < 2) {
                arr.add((long) i);
                System.out.print(arr.get(i) + "[" + (i + 1) + "] ");
            } else {
                arr.add(arr.get(i - 2) + arr.get(i - 1));
                System.out.print(arr.get(i) + "[" + (i + 1) + "] ");
            }
        }
        System.out.println();
    }


    public static long fibonacci(int index) {


        if (arr.isEmpty()) {
            fibonacciNumbersThirtyElements();
        }
        if (arr.get(index) < 1) {
            System.out.println("fibonacci does not have an index of 0 or lower ");
            return 0;
        } else {
            System.out.println(arr.get(index - 1) + "[" + index + "] ");

            return arr.get(index - 1);

            //            return arr.get(index - 1);

        }
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
        if (indexFactorial < 1) {
            throw new RuntimeException("Factorial has only positive numbers ! ");
        } else {
            for (int i = 1; i <= indexFactorial; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(MathUtils.factorial(10));
    }



    public static long fibonacci2(int index) {
//        if (index == 0) {
//            return 0;
//        } else if (index == 1) {
//            return 1;
//        }
        if (index < 2) {
            return index;
        } else {
            return fibonacci2(index - 2) + fibonacci2(index - 1);
        }

    }

    public static long fibonacci3(int index) {
        if (index < 2) {
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
