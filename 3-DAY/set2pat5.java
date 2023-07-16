package day3pat1;

public class set2pat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		 for(int i=1;i<=n;i++)
		 {
	        for(int j=n;j>i;j--)
	        {
	           System.out.print(" ");
	        }
	        for (int k=1;k<=i;k++)
	        {
               System.out.print(" "+k);
            }
	        System.out.println();
		 }
	}

}
