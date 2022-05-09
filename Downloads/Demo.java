public class Demo
{
 public static void main (String args[])
{
 int sum=0;
int i;
int n=args.length;
int a[]=new int[n];
for (i=0; i<n; i++)
{
 a[i]=Integer.parseInt(args[i]);
 sum = sum+a[i];
}
System.out.println(sum);
}
}