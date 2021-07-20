import java.util.*;
class balanced
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
Stack<Integer> s1=new Stack<Integer>();
Stack<Integer> s2=new Stack<Integer>();
for(i=0;i<n;i++)
{
s.add(a[i]);
}
for(int j=0;j<s.size();j++)
{
if(s.get(j)%2!=0)
s1.add(s.get(j));
else
s2.add(s.get(j));
}
if(s1.size()==s2.size())
System.out.println("stack is balanced");
else
System.out.println("stack not balanced");
}
}

5
23 12 25 34 36 
    
