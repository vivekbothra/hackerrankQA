import java.io.*;
import java.util.*;

public class Uppercase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int lengthofstring=sc.nextInt();
        String s= sc.next();
        int rotateby= sc.nextInt();
        StringBuffer sb= new StringBuffer();
        for(char c: s.toCharArray()){
        	//65-90 A-Z
        	//97-122 a-z
        	int asciivalue=(int)c;
        	int newasciivalue=0;
        	if((asciivalue>=65 && asciivalue<=90)){
        		newasciivalue=(asciivalue+rotateby);
        		if(newasciivalue>=90){
        			newasciivalue=65+(asciivalue%90);
        		}
        	}
        	if((asciivalue>=97 && asciivalue<=122)){
        		newasciivalue=(asciivalue+rotateby);
        		if(newasciivalue>=122){
        			newasciivalue=97+(asciivalue%122);
        		}
        	}
        	String string=Character.toString ((char) newasciivalue);
        	
        	sb.append(string);


        }
        System.out.println(sb);
    }
}