public class Fibonacci2 {
    public static void printFib(int n, int a, int b) {
        if (n <= 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        printFib(n - 1, b, c);
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b+ " ");
        int n = 7;
        printFib(n - 2, a, b);
    }
}
