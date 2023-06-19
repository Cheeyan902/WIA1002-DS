package t1q1;

import java.util.Scanner;
public class T1Q1 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        
        Telephone abc [] = new Telephone [5];
        
        for(int i = 0; Telephone.numberofTelephoneObject < 5; i++){
            System.out.print("Enter the areaCode: ");
            String areaCode = cs.nextLine();
            System.out.print("Enter the number: ");
            String number = cs.nextLine();
            abc[i] = new Telephone(areaCode, number);
        }
        
        for(Telephone i : abc){
            System.out.println(i.makeFullNumber());
        }
    }
    
}
