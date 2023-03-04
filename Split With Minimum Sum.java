class Solution {
    public int splitNum(int n) {
        int arr[]=new int[digit(n)];
        for(int i=0;i<arr.length;i++){
            arr[i]=n%10;
            n=n/10;
        }
        Arrays.sort(arr);
        Arrays.toString(arr);
        String num1="",num2="";
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
            num1+=arr[i];
            }
            else
               num2+=arr[i];
        }
        
        int n1=Integer.parseInt(num1);
        int n2=Integer.parseInt(num2);
        return n1+n2;
    }
    static int digit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}