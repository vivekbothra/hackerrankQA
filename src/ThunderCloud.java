import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThunderCloud {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
      int count=0;
        for (int i = 0; i < c.length-2;) {
        	
        	if(i<n-2 && c[i+2]==0){
        		count++;
        		i=i+2;
        		
        	}
        	else if(c[i+1]==0){
        		count++;
        		i++;
        	}
        	else{
        		i++;
        	}
        	
			
		}
        System.out.println(count);
    }
}
