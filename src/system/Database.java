package system;

import java.lang.reflect.*;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.*;

public abstract class Database<T>
{
	private Gson g = new Gson();
	List<T> database = new ArrayList<>();
	String path;

	public Database(String path)
	{
		setPath(path);
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

	List<T> setup(Class<T> type)
	{
		var path = getPath();

		var content = FileIO.getString(path);

		if (content == null)
		{
			content = "[]";
			FileIO.putString(path, content);
		}

		database.clear();

		return g.fromJson(content, getType(type));
	}

	private Type getType(Class<T> type)
	{
		return TypeToken.getParameterized(ArrayList.class, type).getType();
	}

	public void saveData(Class<T> type)
	{
		var path = getPath();

		String s = Json.prettier().toJson(database, getType(type));
		FileIO.putString(path, s);
	}

	public abstract void reload();
}
