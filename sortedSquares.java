class sortedSquares {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = -4;
        arr[1] = -1;
        arr[2] = 0;
        arr[3] = 3;
        arr[4] = 10;

        arr = sortedSquares(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortedSquares(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        return arr2;
    }
}