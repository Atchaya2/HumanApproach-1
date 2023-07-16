package day3pat1;

public class day3pat6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int n=4;
	        int a=0,b=1,c=1;
	       for(int i=1;i<=n;i++)
	       {
	           for(int j=1;j<=i;j++)
	           {
	               System.out.print(c);
	               c=a+b;
	               a=b;
	               b=c;
	            }
	           System.out.println();
	       }
	  }
}
