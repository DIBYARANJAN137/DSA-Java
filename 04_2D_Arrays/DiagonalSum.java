public class DiagonalSum {
    public static void diagonalSum(int matrix[][]){
        int sum=0;
        //Brute ForceApproach

    //    for(int i=0;i<matrix.length;i++){
    //     for(int j=0;j<matrix[0].length;j++){
    //           if(i==j){
    //             sum+=matrix[i][j];
    //           }else if(i+j==matrix.length-1){
    //              sum+=matrix[i][j];
    //           }
    //     }
    //    }
    //    System.out.println("sum="+sum);


    //optimized method
    for(int i=0;i<matrix.length;i++){
        sum+=matrix[i][i];
        if(i!=matrix.length-1-i)
        sum+=matrix[i][matrix.length-1-i];
    }
    System.out.println("sum="+sum);
 }

   
    public static void main(String[] args) {
        int  Matrix[][]={
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        diagonalSum(Matrix);
    }
}
