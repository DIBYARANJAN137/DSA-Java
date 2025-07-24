public class BubbleSort {
    public static void bubbleSort(int numbers[]){
        boolean swapped;
        for(int turn=0;turn<numbers.length-1;turn++){
            swapped=false;
            for(int i=0;i<numbers.length-1-turn;i++){
                   if(numbers[i]>numbers[i+1]){
                    int temp=numbers[i];
                    numbers[i]=numbers[i+1];
                    numbers[i+1]=temp;
                    swapped=true;
                   }
            }
            if(!swapped) break;
        }
    }
    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int numbers[]={5,4,1,3,2};
         int numbers[]={1,2,3,4,5};

        printArray(numbers);
        bubbleSort(numbers);
        printArray(numbers);
    }
}
