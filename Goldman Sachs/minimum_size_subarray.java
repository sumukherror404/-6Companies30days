/*function for finding minimum length subarray*/
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int length = 0;
    int sum = 0;
    for(int i = 0;i < nums.length ; i++){
        int leng = 1;
        sum = 0;
        sum += nums[i];
        if(sum>=target){
            length = 1;
        }
        for(int j = i+1 ;j < nums.length; j++){
            if(sum >= target){
                if(length==0 || length > leng){
                    length = leng;
                    break;
                }
            }
            sum += nums[j];
            leng++;
            if(sum >= target){
                if(length==0 || length > leng){
                    length = leng;
                    break;
                }
            }
        }
    }
    return length;
        }
    }
