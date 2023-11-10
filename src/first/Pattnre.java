package first;

public class Pattnre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4;
		int p=0;
		for(int i=0;i<=4;i++) 
		{
			int temp=p;
			p=p+i;
			
			for(int j=1;j<=i;j++)
			{
				
					System.out.print(p--+" ");
					temp++;
					
			}
				p=temp;
				System.out.println();
			
			
		}
	}

}
