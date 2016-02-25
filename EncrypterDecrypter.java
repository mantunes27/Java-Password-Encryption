
import javax.crypto.*;
import java.security.*;


public class EncrypterDecrypter {

	private static SecretKey key = null;
	private static Cipher cipher = null;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		KeyGenerator keyGenerator =
				KeyGenerator.getInstance("DESede");
		keyGenerator.init(168);
		SecretKey secretKey = keyGenerator.generalKey();
		cipher = Cipher.getInstance("DESede");
		
		String clearText = "I sure love working with the JCE.";
		byte[] clearTextBytes = clearText.getBytes("UTF8");
		
		cipher.init(Cipher.ENCRYPT_MODE, secretKey);
		byte[] decryptedBytes = cipher.doFinal(cipherBytes);
		String decryptedText = new String(decryptedBytes, "UTF8");
		
		System.out.println("Before encryption: " + clearText);
	    System.out.println("After encryption: " + cipherText);
		System.out.println("After decryption: " + decryptedText);
		    
		
	}

}
