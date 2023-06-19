package t2q8;

import java.util.ArrayList;
public class T2Q8 {
    
    public void display(ArrayList<?> arr){
        for(int i = 0; i < arr.size(); i++){
            System.out.printf("%s", arr.get(i));
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        //declare arraylists like ArrayList <Integer> arr1 = {1,2,3};
        //display them by calling methods like display(arr1);
    }
    
}
