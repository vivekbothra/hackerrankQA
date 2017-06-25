import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    static String twoStrings(String s1, String s2){
        // Complete this function
        char[] firstarray=s1.toCharArray();
        char[] secondarray= s2.toCharArray();
        String str="NO";
        int[] countfirstarray= new int[26];
        int[] countsecondarray= new int[26];
        
        
       for (int i = 0; i < firstarray.length; i++) {
    	   countfirstarray[firstarray[i]-'a']++;
		
	}
       for (int i = 0; i < secondarray.length; i++) {
    	   countsecondarray[secondarray[i]-'a']++;
		
	}
       int count=0;
       for (int i = 0; i < countfirstarray.length; i++) {
		if(countfirstarray[i]!=0 && countsecondarray[i]!=0){
			count++;
		}
	}
       if(count>0){
    	   str="YES";
       }else
       {
    	   str="NO";
       }
       return str;
				
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
