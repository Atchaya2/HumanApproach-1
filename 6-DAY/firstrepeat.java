package week2;

public class firstrepeat {
	    public static void main(String[] args) {
	       int a[]={6,10,5,4,9,120,4,6,10};
	       int c=0;
	       for(int i=0;i<a.length;i++)
	       {
	           for(int j=i+1;j<a.length;j++)
	           {
	               if(a[i]==a[j])
	               {
	                 System.out.println(a[j]);
	                 c=1;
	               }
	               if(c==1)
	               {
	                 break;
	               }
	           }  
	      }
	 }
}
