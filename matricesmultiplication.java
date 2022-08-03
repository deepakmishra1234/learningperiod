package datastructure.phase1;
import java.io.*;
public class matricesmultiplication 
{
	
static void printMatrix(int M[][],int RowSize,int ColSize)
		{
			for (int i = 0; i < RowSize; i++)
			{
				for (int j = 0; j < ColSize; j++)
					
					System.out.print(M[i][j] + " ");

				System.out.println();
			}
		}

		
		static void multiplyMatrix(int Row1, int Col1, int X[][],int Row2, int Col2, int Y[][])
		{
			int i, j, k;
			
			System.out.println("\nMatrix X:");
			printMatrix(X, Row1, Col1);
			System.out.println("\nMatrix Y:");
			printMatrix(Y, Row2, Col2);

			if (Row2 != Col1) 
			{
				System.out.println("\n multiplication  is not possible in this condition");
				return;
			}

			
			int Z[][] = new int[Row1][Col2];
			
			for (i = 0; i < Row1; i++) 
			{
				for (j = 0; j < Col2; j++)
				{
					for (k = 0; k < Row2; k++)
						
						Z[i][j] += X[i][k] * Y[k][j];
				}
			}

			
			System.out.println("\n Multipled resultant matrix:");
			printMatrix(Z, Row1, Col2);
		}

		public static void main(String[] args)
		{

			int row1 = 4, col1 = 3, row2 = 3, col2 = 4;

			int X[][] = { { 2,5,7 },{ 4,5,2 },{ 8,4,3 },{ 6,9,7 } };

			int Y[][] = {{15,6,2,3},{6,4,2,9},{3,6,2,7,1}};

		multiplyMatrix(row1, col1, X,row2, col2, Y);
		
		}
	}

	
	
	


	

	

