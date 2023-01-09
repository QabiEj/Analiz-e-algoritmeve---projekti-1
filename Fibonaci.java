import java.io.*;
public class Fibonaci {
	
	
		public static long fib(long n)
		{
			if (n <= 1)
				return n;
			return fib(n - 1) + fib(n - 2);
		}

		public static void main(String args[])
		{
			long startTime = System.nanoTime();
			int n = 100;
			System.out.println(fib(n));
			long finishTime = System.nanoTime();
			long excecutionTime = finishTime - startTime;
			System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");	


		}
	}
