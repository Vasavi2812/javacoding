import java.util.*;
class sortrow
{
public static void main(String args[])
{
int r,c,i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows in matrix : ");
r=sc.nextInt();
System.out.println("enter no.of colomns in matrix :");
c=sc.nextInt();
System.out.println("enter elements in  matrix");
int A[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("the matrix after sorting row wise :");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
for(k=j+1;k<r;k++)
{
if(A[i][j]>A[i][k])
{
int v=A[i][j];
A[i][j]=A[i][k];
A[i][k]=v;
}
}
System.out.print(A[i][j]+" " );
}
System.out.println();
}
}
}





    
