import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinary {

    static int minSteps(int n, String B){
        // Complete this function
    	int count=0;
    	for(int i=0;i<B.length()-3;i++){
    		String x=B.substring(i,i+3);
    		if(x.equals("010")){
    			count++;
    		}
    	}
    	return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
