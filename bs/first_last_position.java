package bs;

public class first_last_position {
    
        public int[] searchRange(int[] nums, int target) {
            int l = 0;
            int h = nums.length-1;
            while(l<=h){
                int mid = (l+h)/2;
                if(nums[mid]>target){
                    h = mid-1;
                }
                if(nums[mid]<target){
                    l = mid+1;
                }
                if(nums[mid]==target){
                    
                    l = mid+1;
                    h = mid-1;
                    while(l <= nums.length-1 && nums[l] == target){
                        l++;
                    }
                    while(h >= 0 && nums[h]==target){
                        h--;
                    }
                    return new int[]{h+1,l-1};
    
                }
    
    
            }
            
    
            return new int[] {-1,-1};
        }
    }
