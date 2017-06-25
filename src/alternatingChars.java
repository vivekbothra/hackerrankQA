import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class alternatingChars {

    static int alternatingCharacters(String s){
        // Complete this function
    	StringBuffer buff= new StringBuffer(s);
    	int count=0;
    	for(int i=0;i<buff.length()-1;i++){
    		if(buff.charAt(i)==buff.charAt(i+1)){
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
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
