class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]prefixProduct=new int[nums.length];
        int[]suffixProduct=new int[nums.length];
        prefixProduct[0]=nums[0];
        suffixProduct[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            suffixProduct[i]=suffixProduct[i+1]*nums[i];
        }
        int[]result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0) result[i]=suffixProduct[i+1];
            else if(i==nums.length-1) result[i]=prefixProduct[i-1];
            else{
                result[i]=prefixProduct[i-1]*suffixProduct[i+1];
            }
        }
        return result;
    }
}  
