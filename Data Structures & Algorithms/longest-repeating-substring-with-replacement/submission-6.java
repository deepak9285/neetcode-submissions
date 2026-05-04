class Solution {
    public int characterReplacement(String s, int k) {
        
        int res=0;
      

        int l=0;
        int r=0;
        HashMap<Character,Integer>mp=new HashMap<>();
        int maxf=0;
        while(r<s.length()){
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,mp.get(s.charAt(r)));
            if((r-l+1)-maxf>k){
                mp.put(s.charAt(l),mp.get(s.charAt(l))-1);
                l++;
              
               
               
            }else {
               
                  res=Math.max(res,r-l+1);
            }
            r++;
        }
        return res;
    }
}
