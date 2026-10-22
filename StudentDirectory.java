package studentdirectory;

import java.util.Scanner;
import java.util.HashMap;

public class StudentDirectory {

    
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
HashMap<String, String> studentList = new HashMap<>();

    System.out.print("Enter Number Of Student: ");
    int n = sc.nextInt();
    sc.nextLine();
    
    for(int i = 0; i < n; i++){
        System.out.print("Enter Student Number: ");
        String studNum = sc.nextLine();
        
        System.out.print("Enter Student Name: ");
        String studName = sc.nextLine();
        
        studentList.put(studNum, studName);
        
    }
    
    System.out.println("Student Directory: " + studentList);
    
    int choice;
    
    do{
        System.out.println("\nChoose an operation:");
        System.out.println("1 - Search");
        System.out.println("2 - Remove");
        System.out.println("3 - Add/Update");
        System.out.println("4 - Exit");
        System.out.print("Enter Your Choice: ");
        
        choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice){
        
        case 1:
        System.out.print("Enter student number to search: ");
        String searchNum = sc.nextLine();

        if (studentList.containsKey(searchNum)) {
        System.out.println("Student name: " + studentList.get(searchNum));
        } else {
        System.out.println("Student not found.");
        }
        break;

        case 2:
        System.out.print("Enter student number to remove: ");
        String removeNum = sc.nextLine();

        if (studentList.containsKey(removeNum)) {
        String removedName = studentList.remove(removeNum);
        System.out.println("Removed student " + removedName);
        System.out.println("Updated student directory: " + studentList);
        } else {
        System.out.println("Student not found.");
        }
        break;

        case 3:
        System.out.print("Enter student number to add or update: ");
        String newNum = sc.nextLine();

        if (studentList.containsKey(newNum)) {
        System.out.print("Enter student name: ");
        String newName = sc.nextLine();

        studentList.put(newNum, newName);
        System.out.println("Student record updated.");
        } else {
        System.out.print("Enter student name: ");
        String newName = sc.nextLine();

        studentList.put(newNum, newName);
        System.out.println(
        "No existing record found. Added new entry.");
        }

        System.out.println("Updated student directory: "
        + studentList);
        break;

        case 4:
         System.out.println("Exiting Student Directory. Goodbye!");
        break;

        default:
        System.out.println(
        "Invalid choice. Please select 1, 2, 3, or 4.");
        }

        } while (choice != 4);

        sc.close();
    }
}
            
            
