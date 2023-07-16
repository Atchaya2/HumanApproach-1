package pattern15;

public class pattern15 {
	public static void main(String args[]) {
		int n = 5;
		int j,k;
		for(int i=n;i>=1;i--)
		{
			for(j=n;j>i;j--)
			{
				System.out.print(" "); 
			}
			for(k=1;k<=i;k++)
			{
				System.out.print("* "); 
			}
			System.out.println();
		}
	}
}





