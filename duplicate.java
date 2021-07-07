import java.util.*;
class duplicate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,j,i,k,v;
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
if(a[i]==a[j])
{
for(v=j;v<n;v++)
{
for(k=j+1;k<n;k++)
{
a[v]=a[k];
a[k]=0;
}
}
}
}
}
System.out.print("array without duplicate elements:");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}
