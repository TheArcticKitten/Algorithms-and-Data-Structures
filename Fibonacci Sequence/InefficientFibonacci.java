public class InefficientFibonacci 
{
	public static void main(String[] sArgs)
	{
		int termEnd = 10;
		for(int i = 1; i <= 10; i++)
		System.out.println(i + " : " + fib(i));
	}

	public static int fib(int term)
	{
		if(term == 0 || term == 1)return 1;
		return fib(term -1) + fib(term -2);
	}
}1