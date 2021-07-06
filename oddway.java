import java.util.*;
class oddway
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,j;
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
for(j=i+1;j<n;j++)
{
if(a[i]>a[j]&&a[i]%2==1)
{
int v=a[i];
a[i]=a[j];
a[j]=v;
}
}
System.out.println();
}
System.out.print("the ascending order of odd numbers in an array");
for(i=0;i<n;i++)
{
if(a[i]%2==1)
System.out.print(a[i]+" ");
}
}
}
