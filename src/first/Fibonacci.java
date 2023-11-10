package first;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=20;
		int a=0,b=1;
		for(int i=0;i<n;i++)
		{
			System.out.print(a+"");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
