import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<Student>();

        while(true)
        {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:

                    System.out.print("Enter ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    double marks = sc.nextDouble();

                    students.add(new Student(id, name, marks));

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    if(students.isEmpty())
                    {
                        System.out.println("No Students Found");
                    }
                    else
                    {
                        for(Student s : students)
                        {
                            s.display();
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID : ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for(Student s : students)
                    {
                        if(s.id == searchId)
                        {
                            s.display();
                            found = true;
                            break;
                        }
                    }

                    if(!found)
                    {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID : ");
                    int updateId = sc.nextInt();

                    boolean updated = false;

                    for(Student s : students)
                    {
                        if(s.id == updateId)
                        {
                            System.out.print("Enter New Marks : ");
                            s.marks = sc.nextDouble();

                            System.out.println("Marks Updated Successfully");
                            updated = true;
                            break;
                        }
                    }

                    if(!updated)
                    {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID : ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for(Student s : students)
                    {
                        if(s.id == deleteId)
                        {
                            students.remove(s);

                            System.out.println("Student Deleted Successfully");

                            deleted = true;
                            break;
                        }
                    }

                    if(!deleted)
                    {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 6:

                    System.out.println("Thank You");
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
