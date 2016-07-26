package sample;

public class palin {

	public static void main(String[] args)
	{
		String str = new String ("how");
		StringBuffer sbr= new StringBuffer (str);
	   if(str.equals(sbr.reverse().toString()))
		{
         System.out.println("is palindrome");
	}
	else
	System.out.println("is not palindrome");
	}
   }
