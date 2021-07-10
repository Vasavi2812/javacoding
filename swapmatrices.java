import java.util.*;
class swapmatrices
{
public static void main(String args[])
{
int r,c,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter no.of rows in matrices : ");
r=sc.nextInt();
System.out.println("enter no.of colomns in matrices :");
c=sc.nextInt();
System.out.println("enter elements in A matrix");
int A[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
A[i][j]=sc.nextInt();
}
}
System.out.println("enter elements in B matrix");
int B[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
B[i][j]=sc.nextInt();
}
}
int k=0;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
k=A[i][j];
A[i][j]=B[i][j];
B[i][j]=k;
System.out.print(A[i][j]+" ");
}
System.out.println();
}
System.out.println();
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
k=B[i][j];
B[i][j]=A[i][j];
A[i][j]=k;
System.out.print(A[i][j]+" ");
}
System.out.println();
}
}
}


    
