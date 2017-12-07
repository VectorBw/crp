package exo5;

public class Factorielle
{
	public static int factorielle (int n)
	{
		if ( n== 0 ) return 1;
		return n * factorielle(n-1);
	}
}