class Solution {
    public int compress(char[] chars) {
        
        int i=0,len=0;
        while(i<chars.length){
            int count=0;
            char curchar=chars[i];
            while(i<chars.length && chars[i]==curchar){
                i++;
                count++;
            }
            chars[len++]=curchar;
            if(count!=1){
                for(char c:Integer.toString(count).toCharArray()){
                    chars[len++]=c;
                }
            }
        }
        return len;
    }
}