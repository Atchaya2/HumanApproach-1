package day3pat1;

public class day3pat10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        for (int i=1;i<=n;i++)
        {
            int o=1;
            int e=2;
            for (int j=1;j<=i;j++)
            {
              if (i%2==1)
              {
                System.out.print(o);
                o=o+2;
              } 
              else
              {
                System.out.print(e);
                e=e+2;
              }

            }
            System.out.println();
	    }
	}
}
