public class strStr {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int result = findstrStr(haystack, needle);
        System.out.println("First occurrence index: " + result);

        haystack = "leetcode";
        needle = "leeto";
        result = findstrStr(haystack, needle);
        System.out.println("First occurrence index: " + result);
    }

    public static int findstrStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int hLen = haystack.length();
        int nLen = needle.length();

        for (int i = 0; i <= hLen - nLen; i++) {
            if (haystack.substring(i, i + nLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
