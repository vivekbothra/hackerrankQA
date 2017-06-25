import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int var=0;
        int array[]= new int[a.length];
        for (int i = 1; i <= a.length; i++) {
        	
        	if(a[i]==i){
        		array[i]=i;
        	}
        	
			
		}
        int newvar[] = new int[a.length];
        
for (int i = 1; i <= array.length; i++) {
        	
        	for (int j = 1; j <= a.length; j++) {
				if(array[i]==a[j]){
					newvar[i]=j;
				}
			}	
			
		}
for (int i = 1; i <= newvar.length; i++) {
	System.out.println(newvar[i]);
}
        
        
    }
}
