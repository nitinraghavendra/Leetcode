package arrays;

import java.util.Arrays;

public  class concatenation {
    public static void main(String[] args) {
        int[] nums = {2,3,4,1,32};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        if(nums.length==0){
            return new int[] {-1};
        }
        int[] ans = new int[2*nums.length];
        for(int i = 0 ; i < nums.length;i++){
            ans[i]=nums[i];

        }
        for(int i = 0 ; i < nums.length;i++){
            ans[i+nums.length]=nums[i];

        }
        
        return ans;
        
    }
}
