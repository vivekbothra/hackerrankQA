import java.io.*;
import java.util.*;

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
    	int testcases=sc.nextInt();
    	int[] array= new int[testcases];
    	for (int i = 0; i < testcases; i++) {
			array[i]=sc.nextInt();
			
		}
    	for (int i = 0; i < array.length; i++) {
			String number=String.valueOf(array[i]);
			int count=0;
			for (int j = 0; j < number.length(); j++) {
				int x=Character.getNumericValue(number.charAt(j));
				
				if(x!=0 && array[i]%x==0){
					count++;
				}	
				
				
			}
			System.out.println(count);
		}
    }
}