public class TeenNumberChecker {

    // Implementing hasTeen method
    public static boolean hasTeen(int a, int b, int c) {
        // We return true iff at least one of the three given numbers lies in the range [13, 19] otherwise false
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    // Implementing isTeen method
    public static boolean isTeen(int a) {
        // Returning true iff a is in [13, 19], we use hasTeen() method
        return  hasTeen(a, 0, 0);
    }

    public static void main(String[] args) {
        // Testing hasTeen method
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        // Testing isTeen method
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
}
