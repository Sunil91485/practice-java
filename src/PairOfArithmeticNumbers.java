public class PairOfArithmeticNumbers {
    public void checkPairOFNumbers(double[] array) {
        int key = 4;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (i != j) {
                    if (array[i] + array[j] == key || array[i] - array[j] == key ||
                            array[i] * array[j] == key || (array[i] != 0 && array[j] / array[i] == key)) {
                        System.out.println("(" + ((int) array[i]) + "," + (int) array[j] + ")");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        PairOfArithmeticNumbers pairOfArithmeticNumbers = new PairOfArithmeticNumbers();
        pairOfArithmeticNumbers.checkPairOFNumbers(new double[]{1, 2, -1, -2, 4, 5, -9, 0, 10, 40});
    }
}
