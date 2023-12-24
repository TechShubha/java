package codeimplimentation;
import java.util.*;
public class MultiDmArray {
	  public static void main(String[] args) {
		  String[][] twoD;
	        twoD = new String[2][3];
	        twoD[0][0] = "DevvSakib";
	        twoD[0][1] = "Frontend";
	        twoD[0][2] = "Hi!";
	        twoD[1][0] = "Developer";
	        twoD[1][1] = "I'm";
	        twoD[1][2] = "";
	        for (int i = 0; i < twoD.length; i++) {
	            for (int j = 0; j < twoD[i].length; j++) {
	                System.out.print(twoD[i][j]);
	                System.out.print(" ");
	            }
	        }
	  }
}
