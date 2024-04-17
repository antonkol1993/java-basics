package lambda;

import java.util.List;

public class Main {

    interface Operation {
        int operate(int x, int y);
    }

    static class SumOperation implements Operation {
        @Override
        public int operate(int x, int y) {
            return x + y;
        }
    }

    static class MultiOperation implements Operation {
        @Override
        public int operate(int x, int y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Operation sumOperation = new SumOperation();
        Operation multiOperation = new MultiOperation();
//        System.out.println(sumOperation.operate(5, 11));

        Operation anonOperation = new Operation() {
            @Override
            public int operate(int x, int y) {
                int x2 = x * x;
                int y2 = y * y;
                return x2 + y2;
            }
        };

        Operation lambda1Operation = (a, b) -> {
            int x2 = a * a;
            int y2 = b * b;
            return x2 + y2;
        };

        Operation lambda2Operation = (a, b) -> a * a + b * b;

        Operation lambda3Operation = Integer::max;
        Operation lambda4Operation = Math::max;

        Operation anon2Operation = new Operation() {
            @Override
            public int operate(int x, int y) {
                return Math.max(x, y);
            }
        };

        Operation[] operations = {sumOperation, multiOperation, anonOperation,
                lambda1Operation, lambda2Operation, lambda3Operation};

        for (Operation op: operations) {
            int result = op.operate(5, 11);
            System.out.println(result);
        }

        if (true) {
            System.out.println("t");
            System.out.println("t2");
        } else
            System.out.println("f");

    }
}
