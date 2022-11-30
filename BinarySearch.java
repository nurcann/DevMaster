//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//// Java implementation of recursive Binary Search
///*class BinarySearch {
//    // Returns index of x if it is present in arr[l..
//    // r], else return -1
//    int binarySearch(int arr[], int l, int r, int x)
//    {
//        if (r >= l) {
//            int mid = l + (r - l) / 2;
//
//            // If the element is present at the
//            // middle itself
//            if (arr[mid] == x)
//                return mid;
//
//            // If element is smaller than mid, then
//            // it can only be present in left subarray
//            if (arr[mid] > x)
//                return binarySearch(arr, l, mid - 1, x);
//
//            // Else the element can only be present
//            // in right subarray
//            return binarySearch(arr, mid + 1, r, x);
//        }
//
//        // We reach here when element is not present
//        // in array
//        return -1;
//    }
//
//    // Driver method to test above
//    public static void main(String args[])
//    {
//        BinarySearch ob = new BinarySearch();
//        int arr[] = { 2, 3, 4, 10, 40 };
//        int n = arr.length;
//        int x = 10;
//        int result = ob.binarySearch(arr, 0, n - 1, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);
//    }
//} */
//

//// Java implementation of iterative Binary Search
class BinarySearch {
    BinarySearch() {
    }

    int binarySearch(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) {
                return m;
            }

            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int[] arr = new int[]{2, 3, 4, 10, 40, 78, 90};
        int n = arr.length;
        int x = 78;
        int result = ob.binarySearch(arr, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }

    }
}