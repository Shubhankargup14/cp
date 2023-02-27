import java.util.*;
class ksum {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int i=0,s=0,k=2;
      
        System.out.println(s(i,n,s,arr,k));
    }
    static int s(int i,int n,int s,int arr[],int sum){
        
        if(i==n){
           if(s==sum){
                return 1;
           }
            else return 0;    
        }
        s+=arr[i];
        int l=s(i+1,n,s,arr,sum);
        s-=arr[i];
       int r=s(i+1,n,s,arr,sum);
            
        
       return l+r;
    }
}