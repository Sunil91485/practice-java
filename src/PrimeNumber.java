public class PrimeNumber {
    public int checkPrimeNumber(int number) {

        if (number % 2 != 0 && number % number == 0 )
            System.out.println(number + " Is primeNumber");
        else {
            System.out.println(number + " Is is not a PrimeNumber");
        }
        return 1;
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.checkPrimeNumber(3);
    }
}
