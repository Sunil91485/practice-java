public class MissingNumber {
    static int checkMissingNumber(int[] array) {
        for (int i = 0; i < 10; i++) {
            boolean found = false;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]) {
                    found = true;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(checkMissingNumber(new int[]{4, 3, 5, 2, 6, 1, 7, 9,0}));
    }
}
