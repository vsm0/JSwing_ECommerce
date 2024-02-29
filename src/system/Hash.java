package system;

import java.util.*;
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

	public static boolean compareHash(String a, String b)
	{
		var hashA = hash(a);
		var hashB = hash(b);
		return Arrays.equals(hashA, hashB);
	}
}
