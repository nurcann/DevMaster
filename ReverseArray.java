public class ReverseArray {
    public static void main(String[] args) {
        int i, halfSize = 0, size = 0, n;
        int[] arr = new int[]{1, 2, 3, 4, 5,6,7,8};

        size = arr.length;
        halfSize = arr.length / 2;
        for (i = 0; i < halfSize; i++) {
            n = arr[i];
            arr[i] = arr[size - 1];
            arr[size-1] = n;
            size = size - 1;
        }
        for(int k = 0; k<arr.length;k++) {
            System.out.println(arr[k]);
        }
    }

}