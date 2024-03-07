package controller;

import java.util.*;
import com.google.gson.reflect.*;

public class ProductDatabase extends Database<Product>
{
	public ProductDatabase(String path)
	{
		super(path);
	}

	public void reload()
	{
		database = setup(Product.class);
	}

	public List<Product> getList()
	{
		return database;
	}

	boolean hasItem(String name)
	{
		for (Product p : database)
			if (p.getName().equals(name))
				return true;

		return false;
	}

	public Product getItem(String name)
	{
		for (Product p : database)
			if (p.getName().equals(name))
				return p;
		return new Product();
	}

	public boolean createItem(String name, String description, String price, String url)
	{
		if (hasItem(name))
			return false;

		var p = new Product(name, description, price, url);

		database.add(p);

		return true;
	}

	public void saveData()
	{
		super.saveData(Product.class);
	}
}
