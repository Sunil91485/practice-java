import java.util.Arrays;

public class StringAnagram {
    public void checkStringAnagram(String string1, String string2) {
        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("The given string is anagram of string1");
        } else {
            System.out.println("The given string is not anagram of string1 ");
        }
    }

    public static void main(String[] args) {
        StringAnagram stringAnagram = new StringAnagram();
        stringAnagram.checkStringAnagram("peek", "keep");
    }
}
