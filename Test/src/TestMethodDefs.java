
public class TestMethodDefs {
	public long square(int i)
	{
		return(i*i);
	}

	public int CountAString(String str)
	{
		int count=0,i=0;
		while(i<str.length())
		{
			if((str.charAt(i)=='a'||str.charAt(i)=='A'))
			count++;
			i++;
		}
		return count;
		
	}
}
