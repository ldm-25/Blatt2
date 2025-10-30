package h3;

public class H3_main {
	
	public static void main (String args[])
	{
		int i = 234;
		int j = 12;
		
		int k = -10;
		
		boolean a,b,c;
		
		if(i>j)
		{
			a = true;
		}
		else
		{
			a = false;
		}
		
		if (i>200)
		{
			b = true;
		}
		else
		{
			b = false;
		}
		
		if(j>100)
		{
			c = true;
		}
		else
		{
			c = false;
		}
		
		
		
		
		if(a==true && b==false && c==false)
		{
			k=1;
		}
		else if (a==true && b==true && c==false)
		{
			k=2;
		}
		else if (a==true && b==true && c==true)
		{
			k=3;
		}
		else if (a==false && b==false && c==false)
		{
			k=4;
		}
		
		System.out.println(k);
		
	}

}
