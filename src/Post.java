import component.*;
import layout.*;
import system.*;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

public class Post extends Page
{
	Map<String, JTextComponent> map = new HashMap<>();

	Post()
	{
		super("Post Page", 240, 512);

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

		if (name == null || name.length() == 0)
			return;

		var url = map.get("imageUrl").getText();

		if (url == null || url.length() == 0)
			return;

		var price = map.get("price").getText();

		if (price == null || price.length() == 0)
			return;

		var description = map.get("description").getText();

		if (description == null || description.length() == 0)
			return;

		var pdb = new ProductDatabase("./data/products.json");
		pdb.createItem(name, description, price);

		openIndex();
	}

	void openIndex()
	{
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
