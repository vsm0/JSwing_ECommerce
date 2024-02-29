package system;

import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.*;

public class AccountDatabase
{
	List<Account> db;
	private String path;

	public AccountDatabase(String path)
	{
		this.path = path;
		reload();
	}

	public void reload()
	{
		var content = FileIO.getString(path);

		if (content == null)
		{
			FileIO.putString(path, "[]");
			content = FileIO.getString(path);
		}

		var gson = new Gson();

		var t = new TypeToken<List<Account>>(){}.getType();

		db = gson.fromJson(content, t);
	}

	public boolean hasAccount(String name, String pass)
	{
		for (Account a : db)
		{
			if (!a.compareName(name))
				continue;

			if (!a.comparePassword(pass))
				continue;

			return true;
		}
	
		return false;
	}

	public boolean hasAccount(String name)
	{
		for (Account a : db)
			if (a.compareName(name))
				return true;

		return false;
	}

	public boolean createAccount(String name, String pass)
	{
		if (hasAccount(name))
			return false;

		var a = new Account(name, pass);

		db.add(a);

		var g = new Gson();

		var s = g.toJson(db);

		FileIO.putString(path, s);

		return true;
	}
}
