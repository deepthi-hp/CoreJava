package deep;
import java.util.*;
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enterarea of triangle");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base of triangle:");
		double base=sc.nextDouble();
		System.out.println("enter height of triangle:");
		double height=sc.nextDouble();
		double result;
		result=0.5*base*height;
		System.out.println("result"+result);
		

	}

}
