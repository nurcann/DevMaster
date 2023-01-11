public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        int l = 0;
        int r = nums.length - 1;

        while(l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }

            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
        //return index;
    }

    public static void main(String[] args) {
        SearchInsert ob = new SearchInsert();
        int[] arr = new int[]{2, 3, 4, 10, 40, 78, 90};
        // int n = arr.length;
        int x = 70;
        int result = ob.searchInsert(arr, x);
       // if (result == -1) {
        //    System.out.println("Element not present");
      //  } else {
            System.out.println("Element found at index " + result);
     //   }

    }
}
