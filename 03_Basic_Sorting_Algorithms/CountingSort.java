public class CountingSort {
    public static void countingSort(int arr[]) {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        //count array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
            arr[j]=i;
            j++;
            count[i]--;
        }
        }
        
    }

    public static void printArray(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
         int numbers[]={1,3,4,1,2,5,3,2,7};
         //int numbers[]={1,2,3,4,5};

        printArray(numbers);
        countingSort(numbers);
        printArray(numbers);
    }
}
