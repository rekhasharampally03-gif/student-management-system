import java.util.ArrayList;
import java.util.List;
public class AuthService {
    private List<user>users=new ArrayList<>();
    public AuthService(){
        users.add(new user("admin","admin123","ADMIN"));
        users.add(new user("user","user123","USER"));
    }
    public String login(String username,String password){
        for(user u:users){
            if(u.getUser().equals(username) && u.getpassword().equals(password)){
                return JwtUtil.generateToken(u.getUser(), u.getpassword());
            }
        }
        return null;
    }

    
}
