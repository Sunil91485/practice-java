public class FactorialNumber {
    public void printFactorialOfNumber(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        FactorialNumber factorialNumber = new FactorialNumber();
        factorialNumber.printFactorialOfNumber(4);
    }
}
