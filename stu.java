import java.util.Scanner;

public class HH {
   
     private String name;
    private int rollNo;
    private String faculty;

    
    // Function to read student details
    public void read_data() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        System.out.print("Enter Faculty: ");
        faculty = scanner.nextLine();
    }
    


    // Function to display student details
    public void display_data() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Faculty: " + faculty);
    }
    public static void main(String args[]){
        HH stu=new HH();
        stu.read_data();
        stu.display_data();
    }
   
}
