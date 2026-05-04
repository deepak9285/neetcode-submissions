class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int l=0;
        int n=s.length()-1;
        int r=0;int maxLength=Integer.MIN_VALUE;
        while(r<=n){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
             set.add(s.charAt(r));
            maxLength=Math.max(maxLength,r-l+1);
            r++;
        }
        return maxLength==Integer.MIN_VALUE?0:maxLength;
    }
}
