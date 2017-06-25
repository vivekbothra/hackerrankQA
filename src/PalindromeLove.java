import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeLove {

    static int theLoveLetterMystery(String s){
        // Complete this function
    char[] array=s.toCharArray();
    int i=0, j=array.length-1;
    int count=0;
    while(i<array.length/2 && j>=array.length/2){
    	if(array[i]==array[j]){
    		i++;
    		j--;
    	}
    	else{
    		if(array[i]>array[j]){
    			
    			count=count+array[i]-array[j];
    			i++;
    			j--;
    		}
    		if(array[j]>array[i]){
    			
    			count=count+array[j]-array[i];
    			i++;
    			j--;
    		}
    	}
    }
    return count;
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = theLoveLetterMystery(s);
            System.out.println(result);
        }
    }
}
