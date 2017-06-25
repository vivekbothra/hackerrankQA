import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagram {
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String characters=sc.nextLine();
        String newchars=characters.toLowerCase();
        
        int countarray[]= new int[26];
        for(int i=0;i<characters.length();i++){
        	if(newchars.charAt(i)>='a' && newchars.charAt(i)<='z' && newchars.charAt(i)!=' '){
        		countarray[newchars.charAt(i)-'a']++;
        	}
        }
        int flag=1;
        for(int i=0;i<countarray.length;i++){
        	if(i<26){
        		if(countarray[i]<1){
        			flag=0;
        		}
        		
        	}
        }
        if(flag==1){
        	System.out.println("pangram");
        }
        else{
        	System.out.println("not pangram");
        }
        
        
    }
}
