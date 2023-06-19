package s2l10aq;

public class Sort {

    public static void main(String[] args) {
        
        int [] arr = {45,7,2,8,19,3};   
        selectionSortSmallest(arr);
        
        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public static void selectionSortSmallest(int [] arr){
        for(int i = 0; i < arr.length; i++){
            int min = arr[i];
            int index = -1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < min){
                   index = j;
                   min = arr[j];
                }
            }
            if(index != -1){
                //swap
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
            }
        }
    }
}
