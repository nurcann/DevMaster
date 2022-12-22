import edu.princeton.cs.algs4.In;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicateElements {
    public int[] removeDuplicates(int[] nums){
        int arrLength = 0;
        LinkedHashSet<Integer> numsSet = new LinkedHashSet<>();
        for(int i = 0; i<nums.length;i++ ){
                numsSet.add(nums[i]);
        }

        int[] newNums = new int[nums.length];
        //Converting Set object to integer array
        int j = 0;
        for (Integer i: numsSet) {
            newNums[j++] = i;
        }

      // newNums = numsSet.toArray(newNums);
        for(int k=0;k< newNums.length; k++){
            nums[k] = newNums[k];
        }
       // nums = newNums;
       return nums;

    }

    public static void main(String[] args) {
        DuplicateElements obj = new DuplicateElements();
        int[] arrToChange = new int[]{0,0,1,1,1,2,2,3,3,4};
        int[] newArr = obj.removeDuplicates(arrToChange);
        for(int i = 0; i<newArr.length; i++){
            System.out.println(newArr[i]);
        }

    }
}
