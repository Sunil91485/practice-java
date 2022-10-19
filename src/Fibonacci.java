public class Fibonacci {
    public void CheckFibonacci(int number1, int number2, int count) {
        int nextNumber;
        System.out.print(number1 + " " + number2);

        for (int i = 0; i < count; i++) {
            nextNumber = number1 + number2;
            System.out.print(" " + nextNumber);
            number1 = number2;
            number2 = nextNumber;
        }
    }

    public static void main(String[] args) {
        Fibonacci prefix = new Fibonacci();
        prefix.CheckFibonacci(5, 6, 10);
    }
}
