package codeimplimentation;
import java.util.*;
public class BreakContinue {
	 public static void main(String[] args) {
		 int i = 2;
	        do {
	            i++;
	            if (i == 4) {
	                System.out.println("Ignore 4");
	                continue;
	            }
	            System.out.println(i);
	        }while (i < 10);
	 }
}
