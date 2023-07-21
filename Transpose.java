public class Transpose {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
		int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++)
		{
            for (int j = 0; j < column; j++)
			{
                transpose[j][i] = matrix[i][j];
            }
        }
		{
        System.out.println("The matrix is: ");
        for(int i = 0; i < row; i++)
		{
            for (int j = 0; j < column; j++)
			{
                transpose[j][i] = matrix[i][j];
            }
        }
		System.out.println();
        
        
        }

     
}
}
