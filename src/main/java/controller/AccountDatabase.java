package controller;

import com.google.gson.reflect.*;

public class AccountDatabase extends Database<Account>
{
	public AccountDatabase(String s)
	{
		super(s);
	}

	public void reload()
	{
		var db = setup(Account.class);
	
		for (Account a : db)
			database.add(new Account(a.name, a.password));
	}

	public boolean hasAccount(String name, String pass)
	{
		for (Account a : database)
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
		for (Account a : database)
			if (a.compareName(name))
				return true;

		return false;
	}

	public boolean createAccount(String name, String pass)
	{
		if (hasAccount(name))
			return false;

		var a = new Account(name, Hash.parse(pass));

		database.add(a);

		saveData(Account.class);

		return true;
	}
}
