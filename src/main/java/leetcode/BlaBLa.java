package leetcode;

// httpes

import java.io.IOException;

// 23423. dagkjadfkghadfklgjldiaf
public class BlaBLa {

    public static void main(String[] args) {
        int x = 5;
        int y = 0;

        int i = 9;
        try {
            i = x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            //????
            i = 0;
        } catch (Exception e) {

        }

//        try {
        try {
            todo();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        } catch (IOException e) {
//            System.out.println("ok");
//        }

        System.out.println(i);
    }


    public static void todo() throws IOException {
        RuntimeException runtimeException = new RuntimeException("rrr");
        throw runtimeException;
    }
}
