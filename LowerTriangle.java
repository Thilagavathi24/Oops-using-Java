public class LowerTriangle
{
  public static void main(String args[])
  {
    int row,col;
	int a[][]={
	          {1,2,3},
			  {4,5,6},
			  {7,8,9}
			 };
			 
	 row=a.length;
	 col=a[0].length;
	 
	 if(row!=col){
	 System.out.println("matrix");
	 }
	 else{
	   System.out.println("Lower Triangle matrix: ");
	   for(int i=0;i<row;i++){
		   System.out.print("\n");
	   for(int j=0;j<col;j++){
		 
	   if(i<j)
	   System.out.print(" ");
	   else
	   System.out.print(a[i][j]+" ");
	   
	   }
	   
	   }
	  }
	 }
	 
  }

			
			  