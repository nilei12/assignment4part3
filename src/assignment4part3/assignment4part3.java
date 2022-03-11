package assignment4part3;

public class assignment4part3 {

	public static void main(String[] args) {
		C s1 = new C();
		s1.add(7,8);
		s1.mul(6,9);
		// TODO Auto-generated method stub

	}

}

interface A {
	void add(int a, int b);

	
}

interface B
{
	void mul(int a, int b);
}

class C implements A, B{
	public void add( int a, int b)
	{
		System.out.println(a+b);
	}
	public void mul(int a, int b)
	{
		System.out.println(a*b);
	}

}