import java.util.*;
class array2big
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i;
System.out.println("enter size of your array");
n=sc.nextInt();
System.out.println("enter array elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int m=a[0];
for(i=0;i<n;i++)
{
if(m<a[i])
m=a[i];
}
int j=a[0];
for(i=0;i<n;i++)
{
if(a[i]==m)
continue;
else
if(j<a[i])
j=a[i];
}
System.out.println("the second largest number is"+j);
}
}
