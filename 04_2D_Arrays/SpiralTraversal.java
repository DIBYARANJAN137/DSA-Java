public class SpiralTraversal {
    public static void spiralTraversal(int arr[][]){
      int startRow=0;
      int startCol=0;
      int endRow=arr.length-1;
      int endCol=arr[0].length-1;
      while (startRow<=endRow && endRow<=endCol ) {
         //top border
         for(int j=startCol;j<=endCol;j++){
            System.out.print(arr[startRow][j]+" ");
         }
         //rightborder
         for(int i=startRow+1;i<=endRow;i++){
            System.out.print(arr[i][endCol]+" ");
         }

         //bottom border
         for(int j=endCol-1;j>=startCol;j--){
            if(startCol==endCol){
               break;
            }
            System.out.print(arr[endRow][j]+" ");
         }
         //left border
         for(int i=endRow-1;i>=startRow+1;i--){
            if(startRow==endRow){
               break;
            }
            System.out.print(arr[i][startCol]+" ");
         }
         startRow++;
         startCol++;
         endCol--;
         endRow--;
      }

    }

    public static void main(String[] args) {
        int spiralMatrix[][]={
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12}
        };
        spiralTraversal(spiralMatrix);
    }
}
