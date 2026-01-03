import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        AuthService authService=new AuthService();
        studentService stservice=new studentService();
        System.out.println("enter username");
        String username=sc.nextLine();
        System.out.println("Enter password");
        String password=sc.nextLine();
        String token=authService.login(username, password);
        if(token==null){
            System.out.println("Login failed");
            return;
        }
        System.out.println("Login successfully");
        System.out.println("Jwt toke: "+token);
        while(true){
            System.out.println("\n1.Add student");
            System.out.println("2.view students");
            System.out.println("3.Exit");
            System.out.println("choose option");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("NAme");
                    String name=sc.nextLine();
                    System.out.println("Age: ");
                    int age=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Course: ");
                    String course=sc.nextLine();
                    stservice.addStudent(new student(id,name,age,course),token);
                    break;
                    case 2:
                        stservice.viewStudets();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        return;
            }
        }
    }

    
}
