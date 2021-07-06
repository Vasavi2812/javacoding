import java.util.*;
class arraysum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,sum=0;
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
sum=sum+a[i];
}
System.out.println("sum of the given array elements"+sum);
}
}
    
