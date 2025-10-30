package h2;

public class H2_main 
{

	public static void main (String args[])
	{
		
		
		int i = 384;
		int j = 2314;
		int k = 12;
		int min = 54;
		int max = 43;
		
		if (j<k)
		{
			if(j<i) 
			{
				min = j;
			}
		}
		if (i<k)
		{
			if(i<j) 
			{
				min = i;
			}
		}
		if (k<j)
		{
			if(k<i) 
			{
				min = k;
			}
		}
		
		
		
		
		
		if (j>k)
		{
			if(j>i) 
			{
				max = j;
			}
		}
		if (i>j)
		{
			if(i>k) 
			{
				max = i;
			}
		}if (k>i)
		{
			if(k>j) 
			{
				max = k;
			}
		}
		
	}
}
