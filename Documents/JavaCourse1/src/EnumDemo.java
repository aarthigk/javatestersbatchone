enum Operation {
    ADD {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    SUB {
        public int apply(int x, int y) {
            return x - y;
        }
    };

    public abstract int apply(int x, int y);
}

public class EnumDemo {
    public static void main(String[] args) {
        Operation operation =Operation.ADD;
        System.out.println("Printing the ADD  " + operation.apply(100,20));
        operation=Operation.SUB;
        System.out.println("Printing the Difference " + operation.apply(100,20));
    }

}