package codeimplimentation;
class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass() {

    }

    EkClass(int x) {
        this.a = x;
        System.out.println("This is base cons with para " + x);
    }

    public int returnnone() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int a) {
        super(a);
        System.out.println("I'm a doclass cons with para " + a);
    }
}

public class ThisSuper {
	 public static void main(String[] args) {
	        EkClass ec = new EkClass(10);
	        DoClass dc = new DoClass(11);
	        System.out.println(ec.getA());
	    }
}
