package deep;

public class Looping {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=0,j=0;
		do
		{
			System.out.println("value of i    " + i);
			i=i+1;
		}
		while(i<5);
		
		while(j<5) {
			System.out.println("value of i    " + j);
			j=j+1;
		}
		for(int k=0;k<=5;k++)
		{
			System.out.println("value of k "+k);
		
		}
		int arr[]= {1,2,3,4,5};
		for(int l:arr)
		{
			System.out.println(l);
		}

	}

}
