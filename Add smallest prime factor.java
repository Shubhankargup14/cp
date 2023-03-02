/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n-->0){
		    
               int x = sc.nextInt();
            
            
              int y = sc.nextInt();
            
            System.out.println(factor(x,y));
		}
	}
      static int factor(int x,int y){
        int sec=0,i=2;
		
		        while( x<y){
		            if(x%2==0){
		            if((y-x)%2==0){
		                sec+=(y-x)/2;
		            }
		            else{
		                sec+=((y-x)/2)+1;
		            }
		            break;
		        }
		          if(x%i==0 ){
		            
		            x+=i;
		            i=2;
		            
		            sec++;
		        }
		        
		        else{
		            i++;
		        }
		        
		    }
		    return sec;
        
    }
}