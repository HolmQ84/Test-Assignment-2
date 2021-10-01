public class StringUtility {

    public String reverse(String aBc) {
        String word = aBc;
        StringBuilder reversed = new StringBuilder();
        for (int i = 0;i<aBc.length();i++) {
            reversed.append(word.substring(word.length() - 1));
            if (word.length() > 1) {
                word = word.substring(0, word.length()-1);

            }
        }
        return reversed.toString();
    }

    public String capitalize(String abc) {
        return abc.toUpperCase();
    }

    public String lowercase(String aBc) {
        return aBc.toLowerCase();
    }
}
;