public class PairOfNumbers {
    public void getPairOfNumber(int[] array) {
        int sum = 7;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println(array[i] + "+" + array[j] + "=" + sum);
                }
            }
        }
    }

    public static void main(String[] args) {
        PairOfNumbers pairOfNumbers = new PairOfNumbers();
        pairOfNumbers.getPairOfNumber(new int[]{0,1,9,7,3,4,8});
    }
}
