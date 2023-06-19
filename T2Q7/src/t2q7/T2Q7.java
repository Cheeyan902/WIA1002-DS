package t2q7;

import java.util.ArrayList;
public class T2Q7 {
    
      public static <T> void allTransportation(ArrayList<? extends T> arry1, ArrayList<?> arry2){
          // or public static <T> void allTransportation(ArrayList<T> list1, ArrayList<? super T> list2)
          //<?> to specify ArrayList parameters can contain elements of any types
          //Method body goes here
          //super is for lower bound, extends is for upper bound
      }
      
      public static void main(String[] args) {
    }
}
