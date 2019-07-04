//problem Link:- https://leetcode.com/problems/n-repeated-element-in-size-2n-array/

class repeatedNTimes {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3 };
        System.out.println(repeatedNTimes(arr));
    }

    public static int repeatedNTimes(int[] A) {
        int num = 0;
        int[] nums = new int[A.length / 2];
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[i] == A[j]) {
                    num = A[i];
                    return num;
                }
            }
        }
        return num;
    }

}