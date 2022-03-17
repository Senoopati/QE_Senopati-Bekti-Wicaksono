public class Problem6 {
    private static boolean palindrome(String value) {
        String reverseStr = "";
        int strLength = value.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + value.charAt(i);
    }
        if (value.toLowerCase().equals(reverseStr.toLowerCase())) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
    }
}
