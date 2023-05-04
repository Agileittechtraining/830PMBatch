package mypackage;

public class Throwsatatement {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
int a = 10 ;
if(a<0) {
	System.out.println("value is smaller than zero");
}else {
	throw new Exception("Value is greater than zero");
}
	}

}
