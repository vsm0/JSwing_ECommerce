package controller;

import java.security.*;
import java.nio.charset.*;

public class Hash
{
	private static byte[] hash(String s)
	{
		try
		{
			var md = MessageDigest.getInstance("SHA-256");
			return md.digest(s.getBytes(StandardCharsets.UTF_8));
		}
		catch (NoSuchAlgorithmException e)
		{
			e.printStackTrace();
		}

		return null;
	}

	public static String parse(String s)
	{
		return new String(hash(s));
	}
}
