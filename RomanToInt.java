//problem Link:- https://leetcode.com/problems/roman-to-integer/

class RomanToInt {
    public static void main(String[] args) {
        int n = romanToInt("III");
        System.out.println(n);
    }

    public static int romanToInt(String s) {
        int no = 0;
        char I = 73;
        char V = 86;
        char X = 88;
        char L = 76;
        char C = 67;
        char D = 68;
        char M = 77;
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            if (i < symbols.length - 1) {
                if (symbols[i] == I) {
                    if (symbols[i + 1] == V) {
                        no += 4;
                        i++;
                        continue;
                    }
                    if (symbols[i + 1] == X) {
                        no += 9;
                        i++;
                        continue;
                    }
                }

                if (symbols[i] == X) {
                    if (symbols[i + 1] == L) {
                        no += 40;
                        i++;
                        continue;
                    }
                    if (symbols[i + 1] == C) {
                        no += 90;
                        i++;
                        continue;
                    }
                }

                if (symbols[i] == C) {
                    if (symbols[i + 1] == D) {
                        no += 400;
                        i++;
                        continue;
                    }
                    if (symbols[i + 1] == M) {
                        no += 900;
                        i++;
                        continue;
                    }
                }
            }

            if (symbols[i] == I) {
                no += 1;
            }

            if (symbols[i] == V) {
                no += 5;
            }

            if (symbols[i] == X) {
                no += 10;
            }

            if (symbols[i] == L) {
                no += 50;
            }

            if (symbols[i] == C) {
                no += 100;
            }

            if (symbols[i] == D) {
                no += 500;
            }

            if (symbols[i] == M) {
                no += 1000;
            }
        }
        return no;
    }

}