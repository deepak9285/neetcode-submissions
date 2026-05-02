class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n=nums.length;
        // int []index=new int[n];
        // for(int i=0;i<n;i++){
        //     index[i]=i;
        // }
        // Arrays.sort(index,(a,b)->numbers[a]-numbers[b]);
        // List<Integer>l=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     if(nums[index[i]]<target){
        //         l.add(index[i]);
        //     }
        // }
        int left=0;
        int right=n-1;
        while(left<right){
            if(nums[left]+nums[right]>target){
                right--;
            }
            else if(nums[left]+nums[right]<target){
                left++;
            }
            else{
                return new int[]{left+1,right+1};
            }
        }
        return new int[]{};

    }
    
}
