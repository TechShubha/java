package codeimplimentation;
class myEmployee {
    private int id;
    private String name;
    public void setName(String n){
        name = n;
    }
    public void setId(int x){
        id = x;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class AccessModGetSet {
	    public static void main(String[] args) {
	        myEmployee rup = new myEmployee();
	        
	        rup.setName("Rup");
	        System.out.println(rup.getName());
	    }

}
