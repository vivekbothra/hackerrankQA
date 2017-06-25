import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GOT {

    static String gameOfThrones(String s){
    	String str="";
    	char[] stringarray=s.toCharArray();
    	int[] countarray= new int[26];
        // Complete this function
    	int flag=0;
        if(s.length()%2==0){
        	for (int i = 0; i < stringarray.length; i++) {
				countarray[stringarray[i]-'a']++;
			}
        	int xyz=0;
        	for (int i = 0; i < countarray.length; i++) {
				if(countarray[i]%2==0){
					flag++;
				}
				if(countarray[i]!=0)
					xyz++;
			}
        	if(flag==xyz)
        		str="YES";
        	else
        		str="NO";
        	
       
		
        	
        }else
        {
        	for (int i = 0; i < stringarray.length; i++) {
				countarray[stringarray[i]-'a']++;
			}
        	int count=0;
        	for (int i = 0; i < countarray.length; i++) {
				if(countarray[i]%2==1){
					count++;
				}
			}
        	if(count==1){
        		str="YES";
        	
        	}
        	else{
        		str="NO";
        	}
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
