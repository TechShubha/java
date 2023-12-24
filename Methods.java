package codeimplimentation;
import java.util.*;
public class Methods {
		int logic(int a, int b) {
	        int c;
	        if (a > b) {
	            c = a - b;
	        } else {
	            c = a + b;
	        }
	        return c;
	    }
	    public static void main(String[] args) {
	        int x, z, y, g,h,j;
	        x = 10;
	        y = 5;
	        g = 11;
	        h = 3;
	        Methods obj = new Methods(); // crreating obj, no need static keyw
	        z = obj.logic(x, y);
	        j = obj.logic(h, g);
	        // z = logic(x, y);
	        System.out.println(z);
	        System.out.println(j);
	}
}
