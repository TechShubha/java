package codeimplimentation;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
        System.out.println("Get input from users.");
        Scanner getInp = new Scanner(System.in);
        System.out.println("Enter a integer 1:");
        int a = getInp.nextInt();
        System.out.println("Enter a integer 2:");
        int b = getInp.nextInt();
        System.out.println(a + b);

    }

}
