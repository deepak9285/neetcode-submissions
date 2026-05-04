// class Solution {
//     public int findMin(int[] nums) {
//         int left = 0;
//         int right = nums.length - 1;int mid=0;
//         while (left <= right) {
//            mid = left + (right - left) / 2;
//             if (nums[left] < nums[right]) {
//                 if (nums[mid] > nums[left]) {
//                     left = mid + 1;
//                 } else {
//                     right = mid;
//                 }
//             } else {
//                 if (nums[mid] > nums[left]) {
//                     right = mid;
//                 } else {
//                     left = mid + 1;
//                 }
//             }
//         }
//         return nums[mid];
//     }
// }

class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;  // go right
            } else {
                right = mid;     // go left (including mid)
            }
        }

        return nums[left];  // or nums[right]
    }
}
