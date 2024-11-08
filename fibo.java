public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = 10;  // Set the number of terms here
        int first = 0, second = 1;

        System.out.print("Fibonacci Sequence: " + first + ", " + second);

        for (int i = 2; i < terms; i++) {
            int next = first + second;
            System.out.print(", " + next);
            first = second;
            second = next;
        }
    }
}
