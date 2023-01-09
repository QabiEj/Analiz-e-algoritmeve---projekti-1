
public class FibonaciOptimizimHapsires {

	
		public static long fib(int n)
		{
			int a = 0, b = 1, c;
			if (n == 0)
				return a;
			for (int i = 2; i <= n; i++)
			{
				c = a + b;
				a = b;
				b = c;
			}
			return b;
		}

		public static void main (String args[])
		{
			long startTime = System.nanoTime();
			int n = 100;
			System.out.println(fib(n));
			long finishTime = System.nanoTime();
			long excecutionTime = finishTime - startTime;
			System.out.println("Koha e ekzekutimit ne nanosekona: " + excecutionTime + " ns");
		}
	};
