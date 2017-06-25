import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
    	int countarray[] = new int[ar.length];
    	for (int i = 0; i < ar.length; i++) {
			countarray[ar[i]]++;
		}
    	int max=0;
    	int type=0;
    	for (int i = 0; i < countarray.length; i++) {
			if(countarray[i]>max){
				max=countarray[i];
				type=i;
			}
		}
    	return type;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
