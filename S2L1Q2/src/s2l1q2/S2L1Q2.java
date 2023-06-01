package s2l1q2;

import java.util.*;
import java.io.*;
public class S2L1Q2 {

    public static void main(String[] args) {
 
        for(int i = 1; i <= 4; i++){
            
            String filename = String.format("src\\text%d.txt",i);
            String symbol = "";
            
            switch(i){
                case 1 -> symbol = ",";
                case 2 -> symbol = ", ";
                case 3 -> symbol = "; ";
                case 4 -> symbol = "\\d";
                default -> {}
            }
            
        try{
            
            System.out.printf("Text %d :", i);
            System.out.println();
            Scanner s = new Scanner(new FileInputStream(filename));
            
            String finalline = "";
            int numofChar = 0;
            
            while(s.hasNextLine()){
                if(i <= 3){
                String line = s.nextLine();
                String [] words = line.split(symbol);
                finalline = String.join("", words);
                numofChar += finalline.length();
                System.out.println(finalline);
                }else{
                    String content = s.nextLine();
                    for(int j =0; j < content.length(); j++){
                    if(Character.isDigit(content.charAt(j)) == false){
                        finalline += content.charAt(j);
                    }
                    numofChar = finalline.length();
                  
                  }
                    System.out.println(finalline);
                }
            }
           
            System.out.println("Number of characters: " + numofChar + "\n");
            
            s.close();
            
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
      }
    }
}
