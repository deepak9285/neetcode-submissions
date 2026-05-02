class Solution {
    public int maxArea(int[] heights) {
       int left=0;
       int right=heights.length-1;
       int area=0;int maxArea=Integer.MIN_VALUE;
       while(left<right){
        area=Math.min(heights[left],heights[right])*(right-left);
        maxArea=Math.max(area,maxArea);
        if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
       }
       return maxArea;
    }
}
