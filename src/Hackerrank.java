import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Hackerrank {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        String hackerrank= "hackerrank";
        char[] hackerarray= hackerrank.toCharArray();
        
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
           char[] array= s.toCharArray();
           
           if(array.length<hackerarray.length){
        	   System.out.println("NO");
           }
           int count=0;
            for(int i=0;i<array.length;i++){
            	if(count<hackerarray.length && hackerarray[count]==array[i]){
            		count++;
            	}
            	}
            
            if(count==hackerarray.length){
            	System.out.println("YES");
            }
            else{
            	System.out.println("NO");
            }
            
        }
    }
}
