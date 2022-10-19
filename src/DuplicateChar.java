public class DuplicateChar {
    public void printDuplicateArray(String string) {
        char[] ch = string.toCharArray();
        int count;
        for (int i = 0; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = 0;
                }
            }
            if (count > 1 && ch[i] != '0') {
                System.out.println(ch[i]);
            }
        }
    }

    public static void main(String[] args) {
        DuplicateChar duplicateChar = new DuplicateChar();
        duplicateChar.printDuplicateArray("sunilkumar");
    }
}
