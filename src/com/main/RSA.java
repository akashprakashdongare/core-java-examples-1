/**
 * 
 */
package com.main;

/**
 * @author Akash.d
 *
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSA {

	public static void main(String[] args) {
			
		
		try {
			System.out.println("\n Read Started...........");
			
			String private_Key = RSAEncryptions.getKey("D:\\i-desk backup\\PrivateKey-enterr10tv_in (2).txt");
			
			String public_key = RSAEncryptions.getKey("D:\\i-desk backup\\PrivateKey-enterr10tv_in (2).txt");
			
			System.out.println("\n Private Key : "+RSAEncryptions.getPrivateKey("D:\\i-desk backup\\PrivateKey-enterr10tv_in (2).txt"));
			
			
			System.out.println("\n Public Key : "+RSAEncryptions.getPublicKey("D:\\i-desk backup\\PrivateKey-enterr10tv_in (2).txt"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class RSAEncryptions {

	public static String getKey(String filename) throws IOException {
		// Read key from file
		String strKeyPEM = "";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = br.readLine()) != null) {
			strKeyPEM += line + "\n";
		}
		br.close();
		return strKeyPEM;
	}

	public static RSAPrivateKey getPrivateKey(String filename) throws IOException, GeneralSecurityException {
		String privateKeyPEM = getKey(filename);
		return getPrivateKeyFromString(privateKeyPEM);
	}

	public static RSAPrivateKey getPrivateKeyFromString(String key) throws IOException, GeneralSecurityException {
		String privateKeyPEM = key;
		privateKeyPEM = privateKeyPEM.replace("-----BEGIN PRIVATE KEY-----\n", "");
		privateKeyPEM = privateKeyPEM.replace("-----END PRIVATE KEY-----", "");
		byte[] encoded = Base64.getDecoder().decode(privateKeyPEM);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(encoded);
		RSAPrivateKey privKey = (RSAPrivateKey) kf.generatePrivate(keySpec);
		return privKey;
	}

	public static RSAPublicKey getPublicKey(String filename) throws IOException, GeneralSecurityException {
		String publicKeyPEM = getKey(filename);
		return getPublicKeyFromString(publicKeyPEM);
	}

	public static RSAPublicKey getPublicKeyFromString(String key) throws IOException, GeneralSecurityException {
		String publicKeyPEM = key;
		publicKeyPEM = publicKeyPEM.replace("-----BEGIN PUBLIC KEY-----\n", "");
		publicKeyPEM = publicKeyPEM.replace("-----END PUBLIC KEY-----", "");
		byte[] encoded = Base64.getDecoder().decode(publicKeyPEM);
		KeyFactory kf = KeyFactory.getInstance("RSA");
		RSAPublicKey pubKey = (RSAPublicKey) kf.generatePublic(new X509EncodedKeySpec(encoded));
		return pubKey;
	}

	public static String sign(PrivateKey privateKey, String message)
			throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, UnsupportedEncodingException {
		Signature sign = Signature.getInstance("SHA1withRSA");
		sign.initSign(privateKey);
		sign.update(message.getBytes("UTF-8"));
		return new String(Base64.getEncoder().encode(sign.sign()), "UTF-8");
	}

	public static boolean verify(PublicKey publicKey, String message, String signature)
			throws SignatureException, NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
		Signature sign = Signature.getInstance("SHA1withRSA");
		sign.initVerify(publicKey);
		sign.update(message.getBytes("UTF-8"));
		return sign.verify(Base64.getDecoder().decode(signature.getBytes("UTF-8")));
	}

	public static String encrypt(String rawText, PublicKey publicKey) throws IOException, GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.ENCRYPT_MODE, publicKey);
		return Base64.getEncoder().encodeToString(cipher.doFinal(rawText.getBytes("UTF-8")));
	}

	public static String decrypt(String cipherText, PrivateKey privateKey)
			throws IOException, GeneralSecurityException {
		Cipher cipher = Cipher.getInstance("RSA");
		cipher.init(Cipher.DECRYPT_MODE, privateKey);
		return new String(cipher.doFinal(Base64.getDecoder().decode(cipherText)), "UTF-8");
	}

}
