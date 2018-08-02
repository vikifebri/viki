
public class looping {

	public static void main(String[] args) {
		int max_loop = 5;
		int i = 1, j, k, l;
		
		while(i <= max_loop)
		{
			j = 1;
			while(j <= i)
			{
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		k = max_loop-1;
		while(k >= 1)
		{
			l = 1;
			while(l <= k)
			{
				System.out.print(l+" ");
				l++;
			}
			System.out.println();
			k--;
		}
		
	}
	

}
