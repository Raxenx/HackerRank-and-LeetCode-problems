import java.io.*;
import java.util.*;

public class Solution {
	/*
	 * An array is a type of data structure that stores elements of the same
	 * type in a contiguous block of memory. In an array, , of size , each
	 * memory location has some unique index, (where ), that can be referenced
	 * as (you may also see it written as ).
	 * 
	 * Given an array, , of integers, print each element in reverse order as a
	 * single line of space-separated integers.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); // open user input
		int n = in.nextInt(); // user input of size of array they will input
		int[] a = new int[n]; // set array and size
		for (int i = 0; i < n; i++) { // put all values into the array
			a[i] = in.nextInt();	
		}
		String array = "";
		for (int i = n-1; i >= 0; i--) {
           array += a[i] + " ";
		}
        System.out.println(array);
	}

}
