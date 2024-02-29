package system;

import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;

public class FileIO
{
	public static String getString(String s)
	{
		var path = Paths.get(s);

		try
		{
			return Files.readString(path);
		}
		catch (IOException e)
		{
			System.out.println("File read error:");
			e.printStackTrace();
		}

		return null;
	}

	public static void putString(String p, String s)
	{
		var path = Paths.get(p);

		try
		{
			if (!Files.exists(path))
				Files.createFile(path);

			Files.writeString(path, s);
		}
		catch (IOException e)
		{
			System.out.println("Failed to write file:");
			e.printStackTrace();
		}
	}
}
