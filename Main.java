// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Fibonacci {
    public static int fibonacci(int n) {
        return (n <= 2) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println("Fibonacci sequence at position " + n + ": " + result);
    }
}