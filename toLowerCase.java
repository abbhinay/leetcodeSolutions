//problem Link:- https://leetcode.com/problems/to-lower-case/

class toLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        char[] upper = str.toCharArray();
        String lower = "";
        for (int i = 0; i < upper.length; i++) {
            if (upper[i] > 64 && upper[i] < 91) {
                int ch = upper[i] + 32;
                char c = (char) ch;
                lower += c;
            } else {
                lower += upper[i];
            }
        }
        return lower;
    }
}