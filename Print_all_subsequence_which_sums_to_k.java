import java.util.*;
class ksum {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        List<Integer>list=new ArrayList<>();
        s(0,3,0,list,arr,2);
    }
    static void s(int i,int n,int s,List<Integer>list,int arr[],int sum){
        
        if(i==n){
        if(s==sum){
            
                System.out.println(list);
            }
            return ;
        }
       
        list.add(arr[i]);
        s+=arr[i];
        s(i+1,n,s,list,arr,sum);
        list.remove(list.size()-1);
        s-=arr[i];
        s(i+1,n,s,list,arr,sum);
        
       
    }
}