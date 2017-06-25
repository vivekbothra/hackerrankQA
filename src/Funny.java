import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny {

    static String funnyString(String s){
        // Complete this function
    	String reverse = new StringBuffer(s).reverse().toString();
    	int count=0;
    	for(int i=0;i<s.length()-1;i++){
    		char si=s.charAt(i);
    		char siplusone=s.charAt(i+1);
    		char revi=reverse.charAt(i);
    		char reviplusone=reverse.charAt(i+1);
    		if(Math.abs(siplusone-si)==Math.abs(reviplusone-revi)){
    			count++;
    		}
    		
    	}
    	if(count==reverse.length()-1){
    		return "Funny";
    	}
    	else{
    		return "Not Funny";
    	}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
