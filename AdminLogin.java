//Implement a Student class with attributes such as ID, name, age, gender, grade, and contact information using ArrayList .
//Create a menu-driven program with an administrator login feature that allows authorized users to:
//A.	 Add a new student to the database.
//B.	Remove a student from the database by their ID.
//C.	 Update student information (name, age, grade, etc.).
//D.	Display all students in the database.
//E.	 Search for a student by their ID, name, grade, or any other criteria.
//F.	Implement error handling and validation for user inputs, such as invalid IDs, duplicate entries, etc.

package Lab;
import java.util.*;
class Student{
	private int id;
	private String name;
	private int age;
	private String Gender;
	private String grade;
	private String contact;
//	public Student(int id2, String name2, int age2, String gender2, String grade2, long contact2) {
//		// TODO Auto-generated constructor stub
//	}
	public  Student(int id,String name,int age, String Gender,String Grade, String contact) {
		this.age=age;
		this.contact=contact;
		this.Gender=Gender;
		this.id=id;
		this.name=name;
		this.grade=Grade;
	}
	public void setID(int id) {
		this.id=id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setGender(String gender) {
		this.Gender=gender;
	}
	public String getGender() {
		return Gender;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getgrade() {
		return grade;
	}
	public void setContact(String contact) {
		this.contact=contact;
	}
	public String getContact() {
		return contact;
	}
	@Override
    public String toString() {
        return "Student [ID=" + id + ", Name=" + name + ", Age=" + age + ", Gender=" + Gender + ", Grade=" + grade
                + ", Contact=" + contact + "]";
    }
	
	
}


public class AdminLogin {
	Scanner sc = new Scanner(System.in);
	private static List<Student> students;
	private static final String ADMIN_USERNAME = "admin";
	private static final String PASSWORD = "pass";
	public  AdminLogin() {
		this.students = new ArrayList<>();
	}
	
	public static void addStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int id = sc.nextInt();
		sc.nextLine(); //consume
		for(Student student : students) {
			if(student.getID() == id) {
				System.out.println("Student already exist");
				return ;
			}
		}
		System.out.println("Enter student name: ");
		String name = sc.nextLine();
		System.out.print("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter student gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter student grade: ");
        String grade = sc.nextLine();
        System.out.print("Enter student contact: ");
        String contact = sc.nextLine();

        students.add(new Student( id,  name, age, gender, grade, contact));
        System.out.println("Student added successfully.");
		
	}
	public void removeStudent() {
        Student toRemove = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id: ");
		int id = sc.nextInt();
		for(Student student: students) {
			if(student.getID() == id) {
				toRemove = student;
				
				break ;
			}
		}
		if(toRemove != null) {
			students.remove(toRemove);
			
			System.out.println("Student removed successfully");
		}else {
			System.out.println("Student not found");
		}
	}
	public void updateStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student ID to update: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		for(Student student: students) {
			if(student.getID() == id) {
				System.out.println("Enter the new name or press enter to skip");
				String name = sc.nextLine();
				if(!name.isEmpty()) student.setName(name);
				
				System.out.println("Enter the new number or press enter to skip");
				String contact = sc.nextLine();
				if(!contact.isEmpty()) student.setContact(contact);
			}
		}
	}
	
	public void displayStudents() {
		for(Student student: students) {
			System.out.println(student.toString());
		}
	}
	public void searchStudent() {
		try {
            System.out.println("Enter the student ID to search: ");
            int id = sc.nextInt();
            for (Student student : students) {
                if (student.getID() == id) {
                    System.out.println("Student found:");
                    System.out.println(student);
                    return;
                }
            }
            System.out.println("Student not found.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            sc.nextLine(); // clear the buffer
        }
	}
	public boolean login() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter username: ");
		String username = sc.nextLine();
		System.out.println("Enter password: ");
		String password= sc.nextLine();
		return ADMIN_USERNAME.equals(username) && PASSWORD.equals(password);
		
			
		
	}
	public static void main(String[] args) {
		AdminLogin adminLogin = new AdminLogin();
		Scanner sc  = new Scanner(System.in);
		if (adminLogin.login()) {
            System.out.println("Login successful.");
            while (true) {
                System.out.println("\n1. Add student\n2. Remove student\n3. Update student\n4. Display all students\n5. Search student\n6. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        adminLogin.addStudent();
                        break;
                    case 2:
                        adminLogin.removeStudent();
                        break;
                    case 3:
                       adminLogin.updateStudent();
                        break;
                    case 4:
                        adminLogin.displayStudents();
                        break;
                    case 5:
                       adminLogin.searchStudent();
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Login failed.");
        }
		
		
	} 

}
