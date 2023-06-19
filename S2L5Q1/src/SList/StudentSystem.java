package SList;

import java.util.Scanner;
import java.util.NoSuchElementException;

public class StudentSystem<E> {
    
    //Instance varibales
    SNode<E> head;
    SNode<E> tail;
    int size;
    
    //Constructors
    public StudentSystem(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    //Methods
    public void add(E e){
        SNode<E> newNode = new SNode<>(e,null);
        if(this.size == 0){
            this.head = this.tail = newNode;
        }else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    }
    
    /*public void removeElement(E e){
        if(this.size == 0){
            throw new NoSuchElementException();
        }
        if(this.size == 1){
            if(this.head.element.equals(e)){
                this.head = this.tail = null;
                this.size = 0;
            }
        }
        if(head.element.equals(e)){
                this.head = this.head.next;
                this.size--;
        }
        SNode<E> currentNode = this.head;
        while (currentNode.next != null) {
            if (currentNode.next.equals(e)) {
                currentNode.next = currentNode.next.next;
                this.size--;
                return;
            }
            currentNode = currentNode.next;
        }
       
        }*/
    public void removeElement(E e){
        if (this.size == 0) {
            System.out.println("The list is empty.");;
        }else if (this.size == 1) {
            if (this.head.element.equals(e)) {
                this.head = this.tail = null;
                this.size = 0;
            } else {
               throw new NoSuchElementException();
            }
        } else {
            SNode<E> current = head;
            SNode<E> previous = null;
            while (current != null) {
                if (current.element.equals(e)) {
                    if (current == head) {
                        head = head.next;
                    } else if (current == tail) {
                        tail = previous;
                        tail.next = null;
                    } else {
                        previous.next = current.next;
                    }
                    size--;
                    return;
                }
                previous = current;
                current = current.next;
            }
          throw new NoSuchElementException();
        }
    }
    
    
    public void printList(){
        SNode<E> current = this.head;
        while(current != null){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean contains(E e){
        SNode<E> current = head;
        while (current != null) {
            if (current.element.equals(e)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void replace(E e, E newE){
        if(this.size == 0){
            throw new NoSuchElementException();
        }
        SNode<E> current = this.head;
        while(current != null){
            if(current.element.equals(e)){
                current.element = newE;
            }
            current = current.next;
        }
    }
    
    public static void main(String [] args){

        Scanner cs = new Scanner(System.in);
        StudentSystem<String> s1 = new StudentSystem<>();
        
        //Add name to list
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        String name = cs.nextLine();
        while(!name.equalsIgnoreCase("n")){
            s1.add(name);
            name = cs.nextLine();
        }
        System.out.println();
        
        //Display details
        System.out.println("You have entered the following students' name :");
        s1.printList();
        System.out.printf("\nThe number of students entered is : %d\n", s1.getSize());
        System.out.println();
        
        //Rename details
        System.out.println("All the names entered are correct? Enter 'r' to rename the student name, 'n' to proceed.");
        char input = cs.nextLine().charAt(0);
        while (input != 'r' && input != 'n') {
            System.out.print("Enter 'r' or 'n':");
            input = cs.nextLine().charAt(0);
        }
        if(input == 'r'){
            System.out.println("\nEnter the existing student name that you want to rename :");
            String oldName = cs.nextLine();
            while (!s1.contains(oldName)) {
                System.out.print("Name not found, please enter an existing student name: ");
                name = cs.nextLine();
            }
            System.out.println("\nEnter the new name : ");
            String newName = cs.nextLine();
            s1.replace(oldName, newName);
            System.out.println("\nThe new student list is : ");
            s1.printList();
        }
        System.out.println();
        
        //Remove name
        System.out.println("Do you want to remove any of your student name? Enter 'y' for yes, 'n' to proceed.");
        char choice = cs.nextLine().charAt(0);
        while (choice != 'y' && choice != 'n') {
            System.out.print("Enter 'y' or 'n':");
            choice = cs.nextLine().charAt(0);
        }
        if (choice == 'y') {
            System.out.println("\nEnter a student name to remove :");
            String nameremove = cs.nextLine();
            while (!s1.contains(nameremove)) {
                System.out.print("Name not found, please enter an existing student name: ");
                nameremove = cs.nextLine();
            }
            s1.removeElement(nameremove);
        }
        System.out.println();
        
        // Display updated
        System.out.printf("The number of updated student is :%d\n", s1.getSize());
        System.out.println("The updated students list is :");
        s1.printList();
        System.out.println();

        // Completion
        System.out.println("All student data captured complete. Thank you!");
        cs.close();
        
    }
}

