import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
    	
    	int[] countarray = new int[101];
    	for (int i = 0; i < ar.length; i++) {
			countarray[ar[i]]++;
		}
    	int pairs=0;
    	for (int i = 0; i < countarray.length; i++) {
			if(countarray[i]>=2){
				pairs=pairs+countarray[i]/2;
			}
		}
    	return pairs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
