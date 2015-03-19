package Tools;
import java.security.MessageDigest;

public class PasswordHash {

	    public static String PasswordHash(String password) throws Exception
	    {	 
	        MessageDigest md = MessageDigest.getInstance("SHA-256");
	        md.update(password.getBytes());
	 
	        byte byteData[] = md.digest();
	 
	        //convert the byte to hex format method 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
	        String hashPassword = sb.toString();
	        return hashPassword;
	    }
}
