
public class PrimeNumber {
	
	public static void main(String[] args) {
		
		for(int i=2;i<100;i++)
		{
			int p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.println(i);
		}
	}

}
