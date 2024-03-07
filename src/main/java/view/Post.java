package view;

import model.*;
import controller.*;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Post extends Page
{
	ProductDatabase pdb;
	Map<String, JTextComponent> map = new HashMap<>();

	Post()
	{
		super("Post Page", 240, 512);

		var cfg = new ConfigDatabase();
		pdb = new ProductDatabase(cfg.get().data + "/" + cfg.get().products);

		putLayout(new VLayout(content));

		createHeader("DigiBay - New Post");

		labelItem("Item Name", "name", new JTextField(20));

		labelItem("Image URL", "imageUrl", new JTextField(20));

		labelItem("Price ($)", "price", new JTextField(5));

		labelItem("Description", "description", new JTextArea(10, 20));

		createHNavMenu("Cancel", "Publish");

		createFooter("DigiBay (c) 2024");

		display();
	}

	void labelItem(String s, String key, JTextComponent c)
	{
		var label = new FLabel(s);
		var group = new LPanel();

		map.put(key, c);

		group.putLayout(new VLayout(group));

		group.addItem(label);
		group.addItem(c);

		addItem(group);
	}

	void createItem()
	{
		var name = map.get("name").getText();

		if (isInvalid(name))
			return;

		var url = map.get("imageUrl").getText();

		if (isInvalid(url))
			return;

		var price = map.get("price").getText();

		if (isInvalid(price))
			return;

		var description = map.get("description").getText();

		if (isInvalid(description))
			return;

		pdb.createItem(name, description, price, url);

		openIndex();
	}

	boolean isInvalid(String s)
	{
		return s == null || s.length() == 0;
	}

	void openIndex()
	{
		pdb.saveData();

		new Index();
		fork();
		dispose();
	}

	public void event(String e)
	{
		switch (e)
		{
			case "Publish":
				createItem();
				break;
			case "Cancel":
				openIndex();
				break;
		}
	}
}
