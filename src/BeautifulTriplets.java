import java.io.*;
import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
    	 Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         int difference= sc.nextInt();
         int[] array= new int[n];
         for(int i=0;i<n;i++){
             array[i]=sc.nextInt();
         }
         int count=0;
         int[] newarray= new int[n];
         for (int i = 0; i < array.length; i++) {
        	 for (int j = i+1; j < array.length; j++) {
        		 if(array[j]-array[i]==difference){
        			 
        		 }
				
			}
			
		}
         System.out.println(count);
    }
}