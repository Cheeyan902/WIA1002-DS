package s2l1q1;

import java.util.*;
import java.io.*;
public class S2L1Q1 {

    public static void main(String[] args) {
      
        Scanner cs = new Scanner(System.in);
        
        //part 1
        try{
            Scanner abc = new Scanner(new FileInputStream("src\\TiewCheeYan_22057371.txt"));
            
            while(abc.hasNextLine()){
                String content = abc.nextLine();
                System.out.println(content);
            }
            
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }catch(IOException e){
            System.out.println("Problem with file input.");
        }
        
        //part 2
        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("src\\TiewCheeYan_22057371.txt"),true));
            //append method here
            System.out.print("Input second part of my letter: ");
            String line = cs.nextLine();
            
            pw.println("Monday, 31 August 2023");
            pw.println();
            pw.println(line);
            
            pw.close();
            
            Scanner read = new Scanner(new FileInputStream("src\\TiewCheeYan_22057371.txt"));
            
            System.out.println();
            while(read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            
            read.close();
            
        }catch (FileNotFoundException e){
            System.out.println("File Not Found.");
        }catch (IOException e){
            System.out.println("Problem with file input.");
        }
    }
}
