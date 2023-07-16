package day3pat1;

public class day3pat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "ABCDEF";

	      for (int i=0; i<word.length(); i++) 
	      {
	        for (int j=0; j<=i; j++)
	        {
	          System.out.print(word.charAt(i));
	        }
	        System.out.println(); // new line
	      }

	}

}
