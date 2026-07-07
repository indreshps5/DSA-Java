import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner (System.in);
		int t= sc.nextInt();
		while(t-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    if(checkSubseq(s1, s2)||checkSubseq(s2, s1)){
		        System.out.println("YES");
		     
		    }
		    else{
		        System.out.println("NO");
		    }
		    
		}

	}
	private static boolean checkSubseq(String a, String b){
	    int i=0, j=0;
	    while(i<a.length()&&j<b.length()){
	        if(a.charAt(i)==b.charAt(j)){
	            i++;
	            j++;
	        }else{
	            j++;
	        }
	    }
	    if(i==a.length()){
	        return true;
	    }else{
	        return false;
	    }
	}
}
