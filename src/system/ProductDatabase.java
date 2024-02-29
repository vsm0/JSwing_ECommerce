package system;

import java.util.*;

public class ProductDatabase extends Database
{
	public ProductDatabase(String path)
	{
		super(path);
	}

	public void reload()
	{
		database = setup();
	}

	public List<Product> getList()
	{
		return database;
	}
}
