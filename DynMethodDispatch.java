package codeimplimentation;
class One {
    public void greet() {
        System.out.println("Welcome to Main class One");
    }

    public void name() {
        System.out.println("Im Main class One");
    }
}

class Two extends One {
    public void wlcm() {
        System.out.println("Welcome to Derived class Two");
    }

    public void name() {
        System.out.println("Im Derived class Two");
    }
}
public class DynMethodDispatch {
	 public static void main(String[] args) {
		 One obj = new Two();
	        obj.greet();
	        obj.name();
	 }
}
