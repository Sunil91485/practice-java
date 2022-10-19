public class StringRotation {
    public static boolean checkStringRotation(String string1, String string2) {
        return (string1.length() == string2.length() && (string1 + string1).indexOf(string2) != -1);
    }

    public static void main(String[] args) {
        String string1 = "abcd";
        String string2 = "acbd";
        if (checkStringRotation(string1, string2))
            System.out.println("String are rotation of each other");
        else {
            System.out.println("String are not rotation of each other");
        }
    }
}
