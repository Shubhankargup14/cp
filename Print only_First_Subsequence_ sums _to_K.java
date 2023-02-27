import java.util.*;
class ksum {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int i=0,s=0,k=2;
        List<Integer>list=new ArrayList<>();
        s(i,n,s,list,arr,k);
    }
    static boolean s(int i,int n,int s,List<Integer>list,int arr[],int sum){
        
        if(i==n){
          if(s==sum){
            
                System.out.println(list);
                return true;
            }
            else return false;    
            
            
        }
       
        list.add(arr[i]);
        s+=arr[i];
        if(s(i+1,n,s,list,arr,sum)==true){
            return true;
        }
        list.remove(list.size()-1);
        s-=arr[i];
        if(s(i+1,n,s,list,arr,sum)==true){
            return true;
        }
        
       return false;
    }
}