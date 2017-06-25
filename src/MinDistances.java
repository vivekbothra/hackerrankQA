import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int array[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            array[A_i] = in.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
        	if(map.containsKey(array[i])){
        		int value=map.get(array[i]);
        		int difference=i-value;
        		if(difference<min){
        			min=difference;
        		}
        	}
        	else
        		map.put(array[i], i);
        
		}
        if(min==Integer.MAX_VALUE)
        	min=-1;
        System.out.println(min);
        
        
    }
}
