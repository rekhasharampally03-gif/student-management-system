public class user {
    private String username;
    private String password;
    private String role;
    public user(String username,String password,String role){
        this.username=username;
        this.password=password;
        this.role=role;
    }
    public String getUser(){
        return username;
    }
    public String getpassword(){
        return password;
    }
    public String getrole(){
        return role;
    }
    
}
