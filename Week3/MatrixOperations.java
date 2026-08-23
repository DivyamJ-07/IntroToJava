public class MatrixOperations {
    static void rowSums(int[][] matrix)
    {
        int sum = 0;
        for(int i=0; i<= matrix.length-1 ; i++)
        {
            for(int j=0; j<= matrix[i].length-1 ; j++)
            {
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
    }

    static void columnSums(int[][]matrix)
    {   
        int sum=0;
        for(int j=0; j<= matrix[j].length-1; j++)
        {
            for(int i=0; i<= matrix[i].length-1;j++)
            {
                sum+=matrix[j][i];
            }
        }
        System.out.println(sum);
    }
    static int[][] add(int[][] first, int[][]second)
    {
        int[][]total=new int[first.length][first[0].length];
        for(int i=0; i<= first.length-1 ; i++)
        {
            for(int j=0; j<= first[i].length-1 ; j++)
            {
                total[i][j]=first[i][j]+second[i][j];
            }
        }
        return total;
    }
    static void transpose(int[][] matrix)
    {
        int[][]transpose = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length;i++)
        {
            for(int j=0; j<matrix[0].length ; j++)
            {
                transpose[j][i]=matrix[i][j];
            }
        }
    }
    static int[][] multiply(int[][] first, int[][] second)
    {
        int multiply[][] =new int[first.length][second[0].length];
        for(int i=0 ; i<first.length ; i++)
        {
            for(int j=0 ; j<second[0].length ; j++)
            {
                  for(int k=0 ; k<first[0].length ; k++)
                {
                    multiply[i][j]+=first[i][k]*second[k][j];
                }
            }
        }
        return multiply;
    }
    static void printMatrix(int[][] matrix)
    {   
        for(int i=0;i<matrix.length;i++)
            {
            for(int j=0;j<matrix[i].length;j++)
                {
                    System.out.print(matrix[i][j]+" ");
                }
            System.out.println();
        }
    }
}