class bigstar9
{
public static void main(String args[])
{
int i,j,N=5;
for(i=1;i<=N;i++)
{
for(j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
for(i=1;i<=N;i++)
{
for(j=1;j<=N-i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
