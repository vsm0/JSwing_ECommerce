package system;

import java.nio.file.*;

public class FileIO
{
	public static String getString(String s)
	{
		var path = Paths.get(s);

		try
		{
			return Files.readString(path);
		}
		catch (Exception e)
		{
			System.out.println("File read error:");
			e.printStackTrace();
		}

		return null;
	}
}
