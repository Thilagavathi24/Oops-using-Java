import java.util.Scanner;
class Diagonalmatrix
{
public static void main(String args[])
{
int row, column,i,j;
Scanner s= new Scanner(System.in);

System.out.println("Enter the number of rows");
row = s.nextInt();

System.out.println("Enter the number columns");
column = s.nextInt();


int a[][] = new int[row][column];


System.out.println("Enter the elements of a");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column ;j++ )
{
a[i][j] = s.nextInt();
}
}

System.out.println("a array");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column ;j++ )
{
if (i == j) 
{
System.out.print(a[i][j]+" ");
}
}
System.out.println();
}


}
}