import java.util.LinkedHashMap;

public class UniqueMaxLength {
    public void getUniqueMaxLength(String string) {
        String uniqueMaxString = null;
        int uniqueMaxLength = 0;
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (!hashMap.containsKey(ch))
                hashMap.put(ch, i);
            else {
                i = hashMap.get(ch);
                hashMap.clear();
            }
        }
        if (hashMap.size() > uniqueMaxLength) {
            uniqueMaxLength = hashMap.size();
            uniqueMaxString = hashMap.keySet().stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
        }
        System.out.println(uniqueMaxString);
    }

    public static void main(String[] args) {
        UniqueMaxLength uniqueMaxLength = new UniqueMaxLength();
        uniqueMaxLength.getUniqueMaxLength("sunilkumar");
    }
}
