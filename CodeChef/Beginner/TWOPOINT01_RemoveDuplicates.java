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
		    int n= sc.nextInt();
		    int a[]= new int[n];
		    for(int i=0; i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    int i=0, j=0;
		    while(j<n){
		        if(a[i]!=a[j]){
		            i++;
		            a[i]=a[j];
		            j++;
		        }
		        else{
		            j++;
		        }
		    }
		    System.out.println(i+1);
		    for(int k=0; k<=i;k++){
		        System.out.print(a[k]+" ");
		    }
		    System.out.println();
		    
		}

	}
}
