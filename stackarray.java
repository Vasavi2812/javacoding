import java.util.*;
class stackarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of an array");
int i,n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Stack<Integer> s=new Stack<Integer>();
System.out.println("the array elements which are added to stack are : ");
for(i=0;i<n;i++)
{
s.add(a[i]);
}
System.out.println(s);
}
}
    
