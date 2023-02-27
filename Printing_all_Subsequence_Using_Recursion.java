import java.util.*;
class Subsequence {
    public static void main(String[] args) {
        int arr[]={3,1,2};
        List<Integer>list=new ArrayList<>();
        s(0,3,list,arr);
    }
    static void s(int i,int n,List<Integer>list,int arr[]){
        
        if(i==n){
            if(list.size()>0){
                System.out.println(list);
            }
            if(list.size()==0){
                System.out.println("[]");
            }
            return ;
        }
       
        list.add(arr[i]);
        s(i+1,n,list,arr);
        list.remove(list.size()-1);
        s(i+1,n,list,arr);
        
       
    }
}