import java.util.Arrays;

public class OneOperationOnString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";

        // Case 1: If both the strings are equal
        if (s1.equals(s2)) {
            System.out.println("No operation is performed.");
            return;
        }

        // Case 2: If the difference in the length is more than 1
        if (Math.abs(s1.length() - s2.length()) > 1) {
            System.out.println("The strings have a length difference more than 1");
            return;
        }

        int len1 = s1.length();
        int len2 = s2.length();

        // Case 3: If the length is same but the characters are different
        if (len1 == len2) {
            int first = -1, second = -1, differenceCount = 0;
            for (int i = 0; i < len2; i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    differenceCount++;
                    if (first == -1) {
                        first = i;
                    } else {
                        second = i;
                    }
                }
            }
            if (differenceCount > 2) {
                System.out.println("Since the character difference is more than 2, one operation is not sufficient");
            } else if (differenceCount == 1) {
                String a = s1.substring(0, first) + s2.charAt(first) + s1.substring(first + 1);
                System.out.println(Arrays.toString(new String[]{a, s2}));
            } else if (differenceCount == 2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first)) {
                char[] chars = s1.toCharArray();
                char temp = chars[first];
                chars[first] = chars[second];
                chars[second] = temp;
                System.out.println(Arrays.toString(new String[]{new String(chars), s2}));
            }
        } else {
            // Determine which string is longer and which is shorter
            String longer = len1 > len2 ? s1 : s2;
            String shorter = len1 > len2 ? s2 : s1;

            // Try removing one character from the longer string to match the shorter
            boolean found = false;
            for (int k = 0; k < longer.length(); k++) {
                String modified = longer.substring(0, k) + longer.substring(k + 1);
                if (modified.equals(shorter)) {
                    System.out.println(Arrays.toString(new String[]{modified, shorter}));
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No single operation can make the strings equal.");
            }
        }
    }
}