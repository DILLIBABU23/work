class week1b
{
	public static void main(String args[])
	{
		int i;
		int n=args.length,temp;
		int a[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=Integer.parseInt(args[i]);
		for(i=0;i<n-1;i++)//outer loop
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		for(i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
