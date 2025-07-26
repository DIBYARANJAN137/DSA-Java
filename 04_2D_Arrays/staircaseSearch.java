public class staircaseSearch {
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0,col=matrix.length-1;
        while(row<matrix.length&& col>=0){
          if(key==matrix[row][col]){
             System.out.println("key found at index:"+ "("+row+","+col+")");
             return true;
          }else if(key<matrix[row][col]){
            col--;
          }else if(key>matrix[row][col]){
            row++;
          }

        }
        System.out.println("key not found!");
        return false;
    }
   public static void main(String[] args) {
    int  Matrix[][]={
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        staircaseSearch(Matrix,13);
   } 
}
