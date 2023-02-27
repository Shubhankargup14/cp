import java.util.*;
class ksum {
    public static void main(String[] args) {
        int arr[]={1,2,1};
        int n=arr.length;
        int i=0,s=0;
        List<Integer>list=new ArrayList<>();
        subs(i,n,s,list,arr,2);
    }
    static void subs(int i,int n,int s,List<Integer>list,int arr[],int sum){
        
        if(i==n){
        if(s==sum){
            
                System.out.println(list);
            }
            return ;
        }
       
        list.add(arr[i]);
        s+=arr[i];
        subs(i+1,n,s,list,arr,sum);
        list.remove(list.size()-1);
        s-=arr[i];
        subs(i+1,n,s,list,arr,sum);
        
       
    }
}
