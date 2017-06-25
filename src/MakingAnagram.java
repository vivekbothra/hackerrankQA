import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagram {

    static int makingAnagrams(String s1, String s2){
        // Complete this function
    	char[] array1=s1.toCharArray();
    	char[] array2=s2.toCharArray();
    	
    	int[] countarray1= new int[26];
    	int[] countarray2= new int[26];
		for (int i = 0; i < array1.length; i++) {
			countarray1[array1[i]-'a']++;
			
		}
		
		for (int j = 0; j < array2.length; j++) {
			countarray2[array2[j]-'a']++;
			
		}
		
		
		int value=0;
		for(int i=0;i<countarray1.length;i++){
			if(countarray1[i]==countarray2[i])
				continue;
			value=value+Math.abs(countarray1[i]-countarray2[i]);
			
		}
    	
    	
    	return value;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
