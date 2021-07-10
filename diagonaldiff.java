import java.util.*;
class diagonaldiff
{
public static void main(String args[])
{
int r,c,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows in matrix : ");
r=sc.nextInt();
System.out.println("enter no.of colomns in matrix :");
c=sc.nextInt();
System.out.println("enter elements in matrix");
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
int s1=0;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(i==j)
{
s1+=a[i][j];
}
}
}
System.out.println("the sum of diagonal elements is :"+s1);
int k=2,s2=0;
for(i=0;i<r;i++)
{
for(j=r-1;j>=0;j--)
{
if(j==k)
{
s2+=a[i][j];
}
}
k-=1;
}
System.out.println("the sum of anti diagonal elements is :"+s2);
System.out.print("the difference between diagonal and anti diagonal is :"+(s1-s2));
}
}



    
