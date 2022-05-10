class sum
{
	public static void main(String args[])
	{
		int n,sum=0;
		for(int i=0;i<args.length;i++)
		{
			n=Integer.parseInt(args[i]);
			sum+=n;
		}
		System.out.println("sum of integers:"+sum);
	}
}