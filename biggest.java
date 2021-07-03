import java.util.*;
class biggest
{
public static void main(String args[])
{
int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,v,u,t,s,z;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
d=sc.nextInt();
e=sc.nextInt();
f=sc.nextInt();
g=sc.nextInt();
h=sc.nextInt();
i=sc.nextInt();
j=sc.nextInt();
k=sc.nextInt();
l=sc.nextInt();
m=sc.nextInt();
n=sc.nextInt();
o=sc.nextInt();
p=sc.nextInt();
{ 
v=(int)Math.max(Math.max(a,b),Math.max(c,d)); u=(int)Math.max(Math.max(e,f),Math.max(g,h)); t=(int)Math.max(Math.max(i,j),Math.max(k,l)); s=(int)Math.max(Math.max(m,n),Math.max(o,p)); z=(int)Math.max(Math.max(v,u),Math.max(t,s));
System.out.println("the biggest number is:"+z);
}
}
}
