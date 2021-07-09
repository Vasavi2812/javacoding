import java.util.*;
class transpose
{
public static void main(String args[])
{
int r,c,i,j=0;
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
System.out.println("matrix after transpose(transposed matrix)");
int b[][]= new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[i][j]=a[j][i];
System.out.print(b[i][j]);
}
System.out.println();
}
}
}
