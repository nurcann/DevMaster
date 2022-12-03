import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean found = false;
        int first = -1;
        int second = -1;

        for(int i=0; i<nums.length;i++){
            for(int k=0;k<nums.length;k++){
                if(i!=k){
                    if((nums[i] + nums[k]) == target){
                        first = i;
                        second = k;
                        found = true;
                    }
                }
            }
            if(found == true)
                break;
        }

        result[0]=first;
        result[1]=second;
        return(result);
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2,5,5,3};
        int target = 10;
        int[] result = new int[2];

        result = twoSum(nums, target);
        System.out.println("["+ result[0] +","+ result[1]+ "]");

    }
}
