import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConvertToPalindrome {

    static int palindromeIndex(String s){
        // Complete this function
    	char[] array = s.toCharArray();
    	int j =array.length-1;
    	for(int i=0;i<array.length;i++){
    		if(array[i] == array[j]){
    			j--;
    			continue;
    		}
    			
    		else{
    			break;
    		}
    			
    	}
    	return j;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
