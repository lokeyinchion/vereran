package play;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigester {
	public byte[] testMD5(String content) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] bytes = md.digest(content.getBytes("utf8"));
		return bytes;
		
	}
	
	public byte[] testSHA1(String content) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		byte[] bytes = md.digest(content.getBytes("utf8"));
		return bytes;
		
	}
	
//	public String testSHA1(String content) throws NoSuchAlgorithmException, UnsupportedEncodingException{
//		MessageDigest md = MessageDigest.getInstance("SHA-1");
//		byte[] bytes = md.digest(content.getBytes("utf8"));
//		return bytes;
//		
//	}
	
	public String byte2hex(byte[] bytes) throws NoSuchAlgorithmException, UnsupportedEncodingException{
//		byte[] bytes = testMD5(content);
//		byte[] bytes = testSHA1(content);
		StringBuilder hex = new StringBuilder();
		for(int i=0;i<bytes.length;i++){
			byte b = bytes[i];
//			System.out.println(b);
			boolean negative = false;
			if(b<0)
				negative = true;
			int inte = Math.abs(b);
			if(negative) 
				inte = inte | 0x80;
			String temp = Integer.toHexString(inte & 0xFF);
			if(temp.length() == 1){
				hex.append("0");
			}
			hex.append(temp.toLowerCase());
		}
		return hex.toString();
		
	}
	
	

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		MessageDigester test= new MessageDigester();
		String testStr="hello,i am chenkangxian,good night!";
		byte[] backByte= test.testMD5(testStr);
		String back = test.byte2hex(backByte);
		System.out.println(back);

	}

}
