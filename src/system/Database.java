package system;

import java.lang.reflect.*;
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

	List<T> setup(Class<T> type)
	{
		var content = FileIO.getString(path);

		if (content == null)
		{
			FileIO.putString(path, "[]");
			content = FileIO.getString(path);
		}

		database.clear();

		return parse(content, type);
	}

	public List<T> parse(String s, Class<T> type)
	{
	//	var listType = new TypeToken<List<T>>(){}
	//		.where(new TypeParameter<T>{}, type)
	//		.getType();
		var listType = TypeToken.getParameterized(ArrayList.class, type).getType();
		return g.fromJson(s, listType);
	}

	public String stringify(List<T> l, Class<T> type)
	{
		var listType = TypeToken.getParameterized(ArrayList.class, type).getType();
		return g.toJson(l, listType);
	}

	public abstract void reload();
}
