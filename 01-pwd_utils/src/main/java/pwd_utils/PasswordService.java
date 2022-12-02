package pwd_utils;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public String encodepwd(String pwd) {
		Encoder encoder=Base64.getEncoder();
		byte[] bytes = pwd.getBytes();
		String encStr = encoder.encodeToString(bytes);
		
		return encStr;
		
	}
	public String decodepwd(String incText) {
		Decoder decoder=Base64.getDecoder();
		byte[] decpas = decoder.decode(incText);
		return new String(decpas);
		
	}

}
