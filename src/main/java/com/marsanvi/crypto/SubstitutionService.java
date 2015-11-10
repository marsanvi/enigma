package com.marsanvi.crypto;import org.springframework.stereotype.Service;import com.marsanvi.crypto.exceptions.InvalidCipherException;@Servicepublic class SubstitutionService {	public String encode (String alphabet, String cipher, String text) throws InvalidCipherException {		if(alphabet.length()!=cipher.length()) {			throw new InvalidCipherException("Cipher has invalid length ");		}		StringBuilder encodedSb = new StringBuilder();		text = text.toLowerCase();		for (char i : text.toCharArray()) {			if (Character.isLetter(i))				encodedSb.append(cipher.charAt(alphabet.indexOf(i)));			else				encodedSb.append(i);		}		return encodedSb.toString();	}	public String decode(String alphabet, String cipher, String text) throws InvalidCipherException  {		return encode(cipher, alphabet, text);	}}