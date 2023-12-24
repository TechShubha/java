package codeimplimentation;
public class MethodOverloading {
	    static void tellJoke() {
	        System.out.println("Hi, I'm not returning anything. I'm void");
	    };

	    static void replaceElement(int a) {
	        a = 100;
	    }

	    static void replaceElement(float[] a) {
	        a[0] = 90;
	    }
	    static void foo() {
	        System.out.println("No argument");
	    }

	    static void foo(int a) {
	        System.out.println("With argument " + a);
	    }

	    static void foo(int a, int b) {
	        System.out.println("With Two argument " + a + b);
	    }

	    public static void main(String[] args) {
	    	 foo();
	         foo(30);
	         foo(30, 90);
	    }
}
