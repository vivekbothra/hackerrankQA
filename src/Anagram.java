import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    static int anagram(String s){
        // Complete this function
    	if(s.length()%2 !=0)
    		return -1;
    	String first=s.substring(0, s.length()/2);
    	String second= s.substring(s.length()/2,s.length());
    	char[] firstarray=first.toCharArray();
    	char[] secondarray=second.toCharArray();
    	int[] countfirst= new int[27];
    	int[] countsecond= new int[27];
    	
    	for (int i = 0; i < countfirst.length; i++) {
			countfirst[i]=0;
		}
    	for (int i = 0; i < countsecond.length; i++) {
			countsecond[i]=0;
		}
    	for (int i = 0; i < firstarray.length; i++) {
			countfirst[firstarray[i]-'a']+=1;
		}
    	for (int i = 0; i < secondarray.length; i++) {
			countsecond[secondarray[i]-'a']+=1;
		}
    	int value=0;
    	for (int i = 0; i < countfirst.length; i++) {
			if(countfirst[i]==countsecond[i])
				continue;
			if(countfirst[i]>countsecond[i]&&countfirst[i]!=0)
	                value+=Math.abs(countfirst[i]-countsecond[i]);
		}
    	
    	return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
