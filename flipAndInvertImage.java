//problem Link:- https://leetcode.com/problems/flipping-an-image/

class flipAndInvertImage {
    public static void main(String[] args) {
        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
        image = flipAndInvertImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                System.out.print(image[i][j]);
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] arr = new int[A.length][A.length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                arr[i][j] = A[i][A.length - j - 1];
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}