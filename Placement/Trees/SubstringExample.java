public class SubstringExample {
    public static void main(String[] args) {
        String s = "abc";
        generateSubstrings(s);
    }

    public static void generateSubstrings(String s) {
        // Outer loop for the starting index of the substring
        for (int i = 0; i < s.length(); i++) {
            // Inner loop for the ending index of the substring
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                // Append character at position j to StringBuilder
                sb.append(s.charAt(j));
                // Print the current substring
                System.out.println(sb.toString());
            }
        }
    }
}
