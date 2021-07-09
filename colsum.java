import java.util.*;
class colsum
{
public static void main(String args[])
{
int r,c,i,j=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows in array : ");
r=sc.nextInt();
System.out.println("enter no.of colomns in array :");
c=sc.nextInt();
System.out.println("enter array elements");
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=sc.nextInt();
}
}
for(j=0;j<c;j++)
{
int sum=0;
for(i=0;i<r;i++)
{
sum+=a[i][j];
}
System.out.println("the"+" "+(j+1)+" "+"col sum is"+" "+sum);
}
}
}
