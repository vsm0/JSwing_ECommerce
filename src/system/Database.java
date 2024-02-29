package system;

import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.*;

public abstract class Database<T>
{
	private Type t = new TypeToken<List<T>>(){}.getType();
	private Gson g = new Gson();

	List<T> database = new ArrayList<>();
	String path;

	public Database(String path)
	{
		this.path = path;
		reload();
	}

	List<T> setup()
	{
		var content = FileIO.getString(path);

		if (content == null)
		{
			FileIO.putString(path, "[]");
			content = FileIO.getString(path);
		}

		database.clear();

		return parse(content);
	}

	public List<T> parse(String s)
	{
		return g.fromJson(s, t);
	}

	public String stringify(List<T> l)
	{
		return g.toJson(l);
	}


	public abstract void reload();
}
