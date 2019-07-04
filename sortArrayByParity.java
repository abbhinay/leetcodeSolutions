//problem Link:- https://leetcode.com/problems/sort-array-by-parity/

class sortArrayByParity {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        for (int no : sortArrayByParity(arr)) {
            System.out.println(no);
        }
    }

    public static int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int evenIndex = 0;
        int oddIndex = A.length - 1;
        for (int no : A) {
            if (no % 2 == 0) {
                arr[evenIndex++] = no;
            } else {
                arr[oddIndex--] = no;
            }
        }
        return arr;
    }
}