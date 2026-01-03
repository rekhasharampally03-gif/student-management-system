import java.util.Base64;
public class JwtUtil {
    private static final String secret_key="mySecretKey";
    public static String generateToken(String username,String role){
        String payload=username+ ":"+role;
        String tokenData=payload+":" +secret_key;
        return Base64.getEncoder().encodeToString(tokenData.getBytes());    
    }
    public static boolean validateToken(String token){
        try{
            String decoded=new String(Base64.getDecoder().decode(token));
            return decoded.endsWith(secret_key);
        }catch(Exception e){
            return false;
        }
    }
    public static String extractusername(String token){
        String decoded=new String(Base64.getDecoder().decode(token));
        return decoded.split(":")[0];
    }
    
}
