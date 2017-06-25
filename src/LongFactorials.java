import java.io.*;
import java.util.*;

public class LongFactorials {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int n=sc.nextInt();
    	int[] array= new int[n];
    	for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
    	Arrays.sort(array);
    	int min=array[0];
    	int count=0;
    	for (int i = 0; i < array.length; i++) {
			if(array[i]==array[0]){
				count++;
			}
		}
    	System.out.println(array.length);
    	for (int i = 0; i < array.length; i++) {
			int x=array.length-count;
		}
    	
    	
    	
        
    }
}