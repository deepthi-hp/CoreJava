package deep;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		int i=0;
		int j=10/i;
		System.out.println("hiiii");
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant be divided");
		}
		System.out.println("Hello");
	}

}
