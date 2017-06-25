import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Mars {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] array=S.toCharArray();
        int count=0;
        for(int i=0;i<array.length-2;i+=3){
        	
        	if(array[i]=='S' && array[i+1]=='O' && array[i+2]=='S'){
        		continue;
        	}
        	if(array[i]!='S')
        		count++;
        	if(array[i+1]!='O')
        		count++;
        	if(array[i+2]!='S')
        		count++;
        }
        System.out.println(count);
        
    }
}
