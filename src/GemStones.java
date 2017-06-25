import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones {

    static int gemstones(String[] arr){
        // Complete this function
    	int[] count = new int[26];
        for(int i=0;i<arr.length;i++){
            String x=arr[i];
            char[] chararray=x.toCharArray();
            
            HashSet<Character> set= new HashSet<Character>();
            for (Character c : chararray) {
				set.add(c);
				
			}
            for (Character character : set) {
				count[character-'a']++;
			}
            
        }
        int flag=0;
        for (int i = 0; i < count.length; i++) {
        	if(count[i]==arr.length){
        		flag++;
        	}
			
		}
        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
