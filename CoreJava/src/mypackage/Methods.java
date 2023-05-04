package mypackage;

public class Methods {
	static int p = 10; //static instance variable
	int q = 30; //non static instance variable
	
public Methods() {
	System.out.println("Hello");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(p);
Methods m = new Methods();  //Object is created
Methods n = new Methods();

int a = m.mymethod();
System.out.println(m.q);
System.out.println(a);
m.mymethod();
m.myothermethod(1, 2);
	}
    private int mymethod() {
    	int a = 20;
    	int b = 30;
    	int c = a+b;
    	System.out.println(c);
    	return 1000;
    	
    }
    private void myothermethod(int a,int b) {
    	int c = a+b;
    	System.out.println(c);
    	
    	
    }
    
    public void mymethod(int a) {
    	System.out.println(a);
    }
}
