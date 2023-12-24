package codeimplimentation;
import java.util.*;
public class Practice {
	public static void main(String[] args) {
		 int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	        
	        int a = Math.floorDiv(arr.length, 2);
	        int temp;
	        for (int i = 0; i < a; i++) {
	        	 for (int e : arr) {
	                 System.out.println(e);
	             }
	        }
	        int max = Integer.MIN_VALUE;
	        for (int i : arr) {
	            if (i > max) {
	                max = i;
	            }
	        }
	        System.out.println(max);
	        boolean isSorted = true;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) {
	                isSorted = false;
	                break;
	            }
	        }
	        System.out.println(isSorted);
	}
}
