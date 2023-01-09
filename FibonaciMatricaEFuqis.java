
public class FibonaciMatricaEFuqis {

	
		
		public static long fib(int n)
		{
		int F[][] = new int[][]{{1,1},{1,0}};
		if (n == 0)
			return 0;
		power(F, n-1);
		
		return F[0][0];
		}
		
		/* Funksioni ndihmës qe shumzon 2 matricat F dhe M të madhesis 2*2, 
		 * dhe e vendos rezultatin prapa te F[][]*/
		public static void multiply(int F[][], int M[][])
		{
		int x = F[0][0]*M[0][0] + F[0][1]*M[1][0];
		int y = F[0][0]*M[0][1] + F[0][1]*M[1][1];
		int z = F[1][0]*M[0][0] + F[1][1]*M[1][0];
		int w = F[1][0]*M[0][1] + F[1][1]*M[1][1];
		
		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
		}

		/* Funksioni ndihmes qe llogarit F[][] në fuqin n dhe e vendos rezultatin 
		 * në F[][].
		 * Vërejmë se ky funksion është i dizajnuar veq per fib() dhe nuk do të
		 * funksionoj si funksion i pergjithshem i fuqisë */
		public static void power(int F[][], int n)
		{
		int i;
		int M[][] = new int[][]{{1,1},{1,0}};
		
		// shumezojm matricen F (n-1)-here me {{1,0},{0,1}}
		for (i = 2; i <= n; i++)
			multiply(F, M);
		}
		
		/* Funksioni main */
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
