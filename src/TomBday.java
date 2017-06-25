import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TomBday {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            long minamount=0;
            if(z>=Math.abs(x-y)){
            	minamount= b*x+w*y;
            	
            }
            else{
            	if(x>=y){
            		minamount=w*y+b*z+b*y;
            	}
            	if(y>=x){
            		minamount=b*x+w*z+w*x;
            	}
            	
            }
            System.out.println(minamount);
            
            
        }
    }
}
