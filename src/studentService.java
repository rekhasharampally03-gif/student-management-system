import java.util.*;
public class studentService {
    private List<student>students=new ArrayList<>();
    private boolean isAuthorized(String token){
        return JwtUtil.validateToken(token);
    }
    public void addStudent(student s,String token){
        if(!isAuthorized(token)){
            System.out.println("Unauthorised access");
            return;
        }
        students.add(s);
        System.out.println("student added sucessfully");
    }
    public void viewStudets(){
        if(students.isEmpty()){
            System.out.println("No students available");
            return;
        }
        for(student s:students){
        System.out.println(s);
    }

    }
    
}


