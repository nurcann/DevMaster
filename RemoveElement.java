import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int counter=0;
        for(int i = 0; i<nums.length;i++ ){
            if(nums[i] != val) {
                nums[counter]=nums[i];
                counter++;
            }
        }

        for(int i = 0;i<nums.length; i++){
            System.out.println(nums[i]);
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{0,1,2,2,4,0,3,2};
        RemoveElement obj = new RemoveElement();
        int result = obj.removeElement(numbers,2);
        System.out.println(result);
    }
}
