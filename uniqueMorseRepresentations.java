//problem Link:- https://leetcode.com/problems/unique-morse-code-words/

class uniqueMorseRepresentations {
    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        boolean contains = false;
        int count = 0;
        int index = 0;
        String[] codeArray = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        String[] codes = new String[100];
        String code = "";
        for (String word : words) {
            System.out.println(word);
            String[] ch = word.split("");
            for (String character : ch) {
                switch (character) {
                case "a":
                    code += codeArray[0];
                    break;
                case "b":
                    code += codeArray[1];
                    break;
                case "c":
                    code += codeArray[2];
                    break;
                case "d":
                    code += codeArray[3];
                    break;
                case "e":
                    code += codeArray[4];
                    break;
                case "f":
                    code += codeArray[5];
                    break;
                case "g":
                    code += codeArray[6];
                    break;
                case "h":
                    code += codeArray[7];
                    break;
                case "i":
                    code += codeArray[8];
                    break;
                case "j":
                    code += codeArray[9];
                    break;
                case "k":
                    code += codeArray[10];
                    break;
                case "l":
                    code += codeArray[11];
                    break;
                case "m":
                    code += codeArray[12];
                    break;
                case "n":
                    code += codeArray[13];
                    break;
                case "o":
                    code += codeArray[14];
                    break;
                case "p":
                    code += codeArray[15];
                    break;
                case "q":
                    code += codeArray[16];
                    break;
                case "r":
                    code += codeArray[17];
                    break;
                case "s":
                    code += codeArray[18];
                    break;
                case "t":
                    code += codeArray[19];
                    break;
                case "u":
                    code += codeArray[20];
                    break;
                case "v":
                    code += codeArray[21];
                    break;
                case "w":
                    code += codeArray[22];
                    break;
                case "x":
                    code += codeArray[23];
                    break;
                case "y":
                    code += codeArray[24];
                    break;
                case "z":
                    code += codeArray[25];
                    break;

                }
            }
            System.out.println(code);
            try {
                for (int i = 0; i < codes.length; i++) {
                    if (codes[i].equals(code)) {
                        contains = true;
                        break;
                    }
                }
            } catch (Exception e) {
                contains = false;
            }

            codes[index++] = code;
            if (!contains) {
                count++;
            }
            code = "";
        }
        return count;
    }
}