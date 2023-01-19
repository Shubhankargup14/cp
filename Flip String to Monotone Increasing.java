class Solution {
    public int minFlipsMonoIncr(String s) {
        int flip=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else
              flip=Math.min(flip+1,count);
               
        }

      return flip;
    }
}