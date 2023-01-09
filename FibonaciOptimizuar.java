public class FibonaciOptimizuar {
	
	public static long fib(int n)
		{
		/* Deklarojmë një varg për ruajtjen e numrave fibonaçi */
		int f[] = new int[n+2]; 
		int i;
		
		/* Numri i parë dhe i dytë janë 0 dhe 1 respektivisht*/
		f[0] = 0;
		f[1] = 1;
		
		for (i = 2; i <= n; i++)
		{
		/* Shtojmë 2 termat e kaluar në seri dhe i ruajmë ata */
			f[i] = f[i-1] + f[i-2];
		}
		
		return f[n];
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
