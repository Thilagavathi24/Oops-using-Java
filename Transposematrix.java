import java.util.Scanner;
class Transposematrix
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

     System.out.println(" array");

      for ( i= 0 ; i < row ; i++,System.out.printf("\n") )
      { 
        for ( j= 0 ; j < column ;j++ )
        {
          System.out.print(a[j][i]);
        }
      }
        System.out.print("\n");


   }
}