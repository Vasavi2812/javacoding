import java.util.*;
class linesum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,j,i,s=0;
System.out.println("enter size of your array");
n=sc.nextInt();
System.out.println("enter array elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
{
s+=a[j];
}
}
System.out.print("the sum of array elements while running:");
System.out.print(s);
}
}
