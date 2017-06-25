import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grade {

    static int[] solve(int[] grades){
        // Complete this function
    	int[] newarray= new int[grades.length];
    	for (int i = 0; i < grades.length; i++) {
			if(grades[i]<38){
				newarray[i]=grades[i];
			}
			else{
				int x=grades[i]/5*5+5;
				if(x-grades[i]<3){
					
					newarray[i]=x;
				}
				else{
					newarray[i]=grades[i];
				}
			}
		}
    	return newarray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}
