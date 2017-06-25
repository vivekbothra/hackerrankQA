import java.io.*;
import java.util.*;

public class ServiceLane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);
    	int lengtharray=sc.nextInt();
    	int testcases=sc.nextInt();
    	int[] array= new int[lengtharray];
    	for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
    	
    	for(int i=0;i<testcases;i++){
    		int initial= sc.nextInt();
    		int finall = sc.nextInt();
    		int min=Integer.MAX_VALUE;
    		for (int k=initial;  k<=finall; k++) {
    			if(array[k]<min){
    				min=array[k];
    			}
    		}
    		System.out.println(min);
    	}
    	
    	
    }
}