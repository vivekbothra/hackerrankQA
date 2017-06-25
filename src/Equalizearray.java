import java.io.*;
import java.util.*;

public class Equalizearray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] array= new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] countarray= new int[101];
        for (int i = 0; i < array.length; i++) {
			countarray[array[i]]++;
		}
        int max=0;
        
        for (int i = 0; i < countarray.length; i++) {
			if(countarray[i]>max){
				max=countarray[i];
				
			}
		}
        System.out.println(array.length-max);
        
    }
}