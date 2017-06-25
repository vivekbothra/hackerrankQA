import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
      
        long n = in.nextLong();
       
        long count=0;
        char[] x=s.toCharArray();
        for (int i = 0; i < x.length; i++) {
			if(x[i]=='a')
				count++;
		}
       
        long factor=n/x.length;
        long remainder=n%x.length;
        count=count*factor;
        for(int i=0;i<remainder;i++){
        	if(x[i]=='a')
        		count++;
        }
        System.out.println(count);
        
    }
}
