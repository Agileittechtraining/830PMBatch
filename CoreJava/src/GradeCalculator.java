
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int johnny = totalmarks(45, 10, 10);
grade(johnny);
	}
public static int totalmarks(int maths,int geo,int chemistry) {
	int total = maths+geo+chemistry;
	System.out.println("Your Total marks is"+total);
	return total;
}
public static void grade(int total) {
	if(total>75) {
		System.out.println("you passed in distinction");
	}else if(total<75 && total>55){
		System.out.println("you passed");
	}else {
		System.out.println("better luck next time");
	}
}
}
