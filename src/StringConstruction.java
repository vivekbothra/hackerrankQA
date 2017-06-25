import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {

    static int stringConstruction(String s){
        // Complete this function
    	char[] chararray=s.toCharArray();
    	int[] countarray= new int[26];
    	for (int i = 0; i < chararray.length; i++) {
			countarray[chararray[i]-'a']++;
		}
    	int count=0;
    	for (int i = 0; i < countarray.length; i++) {
			if(countarray[i]>=1){
				count++;
			}
		}
    	return count;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
    }
}
