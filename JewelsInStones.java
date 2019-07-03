//problem Link:- https://leetcode.com/problems/jewels-and-stones/

class JewelsInStones {
    public static void main(String[] args) {
        int no = numJewelsInStones("aA", "aAAbbbbb");
        System.out.println(no);
    }

    public static int numJewelsInStones(String J, String S) {
        int num = 0;
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        for (int i = 0; i < jewels.length; i++) {
            for (int j = 0; j < stones.length; j++) {
                if (jewels[i] == stones[j]) {
                    num++;
                }
            }
        }
        return num;
    }
}