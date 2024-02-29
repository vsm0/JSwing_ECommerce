package system;

import com.google.gson.*;

public class AccountDatabase
{
	Account[] accounts;

	public AccountDatabase(String path)
	{
		var content = FileIO.getString(path);

		if (content == null)
			System.exit(1);


	}

	public AccountDatabase()
	{
	}

	public boolean hasAccount(String name, String pass)
	{
		for (Account a : accounts)
		{
		}
	}
}
