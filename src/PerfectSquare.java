public class PerfectSquare {
    public static void main(String[] args) {
        int number = 25;
        boolean isPerfectSquare = isPerfectSquare(number);
        System.out.println("Is " + number + " a perfect square? " + isPerfectSquare);
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return (sqrt * sqrt == number);
    }
}