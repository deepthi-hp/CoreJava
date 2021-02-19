package deep;

public abstract class ParentClass {
	int Empno=101;
	public void display()
	{
		System.out.println("empno:"+Empno);
	}
abstract void run();
abstract void safety();
}
