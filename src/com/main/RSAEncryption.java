/**
 * 
 */
package com.main;

import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

/**
 * @author Akash.d
 *
 */
public class RSAEncryption {

	public static void main(String[] args) {
		String requestString = "{" + "" + "" + "" + "\"CORPID\" : \"PRACHICIB1\"," + "" + "\"USERID\" : \"USER3\"," + ""
				+ "\"AGGRNAME\" : \"VIRTUALB\"," + "" + "\"AGGRID\" : \"OTOE0179\"," + "" + "\"URN\" : \"SR198033817\","
				+ "" + "\"DEBITACC\" : \"000451000301\"," + "" + "\"CREDITACC\" : \"000405002777\"," + ""
				+ "\"IFSC\" : \"ICIC0000011\"," + "" + "\"AMOUNT\" : \"75.00\"," + "" + "\"CURRENCY\" : \"INR\"," + ""
				+ "\"TXNTYPE\" : \"TPA\"," + "" + "\"PAYEENAME\" : \"test\"," + "" + "\"REMARKS\" : \"\"," + ""
				+ "\"UNIQUEID\" : \"ffa91b1c9ab141a98cd538af64f0919f\"," + "" + "\"WORKFLOW_REQD\" : \"N\"" + "" + "}";
		Encryption en = new Encryption();
		String encryted_str = en.encrypt(requestString);
		System.out.println("\n Encrypted  : " + encryted_str);
		//System.out.println("\n Decrypted  : " + en.decrypt(encryted_str));

	}

}

class Encryption {
	PrivateKey privateKey;
	PublicKey publicKey;
	private final static String PRIVATE_KEY = "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";

	private final static String PUBLIC_KEY = "MIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEAz56fYSsSwROZ+hkmN/cj"
			+ "kMhzwoC3p2/9mQpgdymWLWDIsWMk1tmfKThSbtRoq9TR+mqewtuhqlcpHSIcWnj/"
			+ "tJH2ROHgV+8WuunakqZB3x/9F/o4+Tb/jyJfuwKzSeXwhlgyp7VO3VgAwU8mM8gf"
			+ "8RHHe+dZiGAdSZEYmqMd+jg141HQhqsXccBhfiGHorQtoBCFSirpK5bJZ/2b2rMd"
			+ "Eelarh4lGxuE9gtpO23xdL68+kGMWN9Ct4O2BZ0hfAq4erwQ5L8rEGJ9OEK0QEwZ"
			+ "lRJhkGiV2rWR1pqSS3kVpeF76DQVastzFqVpJLhscrRAK/UtuHe1w960I7dfJHUm"
			+ "PbxIv7mBibjriOaMwZREnChxZSG413SoAq3xsy/00IOAqJZKYCXN7OdFh41prLZy"
			+ "SDloHm007mX/ylSHwTCovIoQIWcKg28GVxqgki9nSymtA750fOCBP9D3CXRdEVSQ"
			+ "+HhIUYciKqV3LpWADoju5VZvu97Vjc/jKGV9MNX8evhkviBMVWuitLVrhOpqnfyK"
			+ "oed8zd2PCDBufO/RMlkLLBnkQPwxEOa5vpbiM1gxVqu4bWAtV/uATaxRj92BNG7U"
			+ "d3Df9iU5j1elB5sE/ftEPf5Sn6gRjGM97TgLLitMXH3/xKW64E+/A0dZWYeS/VQs" + "0e6bRVDeR6PXuNsR474V+0kCAwEAAQ==";

	public Encryption() {
		try {
			X509EncodedKeySpec keySpecPublic = new X509EncodedKeySpec(Base64.getDecoder().decode(PUBLIC_KEY));
			PKCS8EncodedKeySpec keySpecPrivate = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(PRIVATE_KEY));

			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			publicKey = keyFactory.generatePublic(keySpecPublic);
			//privateKey = keyFactory.generatePrivate(keySpecPrivate);

			/*
			 * KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
			 * generator.initialize(4096, new SecureRandom()); KeyPair pair =
			 * generator.generateKeyPair(); privateKey = pair.getPrivate(); publicKey =
			 * pair.getPublic();
			 * 
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String encrypt(String message) {
		String encryptString = "";
		try {
			byte[] messageToByte = message.getBytes();
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] encryptedBytes = cipher.doFinal(messageToByte);
			encryptString = Base64.getEncoder().encodeToString(encryptedBytes);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptString;
	}

	public String decrypt(String message) {
		String decryptString = "";
		try {
			byte[] encryptedBytes = Base64.getDecoder().decode(message);
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] decrptedMessage = cipher.doFinal(encryptedBytes);
			decryptString = new String(decrptedMessage, "UTF8");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return decryptString;
	}

}
