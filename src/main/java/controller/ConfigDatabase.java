package controller;

import java.lang.reflect.*;
import com.google.gson.*;
import com.google.gson.reflect.*;

public class ConfigDatabase
{
	private static String path;
	private static Gson json = new Gson();
	private Config database;
	private static Type type = new TypeToken<Config>(){}.getType();

	public ConfigDatabase(String path)
	{
		setPath(path);
		reload();
	}

	public ConfigDatabase()
	{
		reload();
	}

	public void setPath(String path)
	{
		this.path = path;
	}

	public String getPath()
	{
		return path;
	}

	public void reload()
	{
		var path = getPath();

		var s = FileIO.getString(path);

		if (s == null)
		{
			s = "{}";
			FileIO.putString(path, s);
		}

		database = json.fromJson(s, type);
	}

	public Config get()
	{
		return database;
	}

	public void saveData()
	{
		var path = getPath();

		var s = json.toJson(database, type);

		FileIO.putString(path, s);
	}
}
