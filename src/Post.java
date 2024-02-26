import java.awt.*;
import javax.swing.*;

import component.*;
import layout.*;

public class Post extends Page
{
	Post()
	{
		super("Post Page", 240, 512);

		putLayout(new VLayout(content));

		createHeader("DigiBay - New Post");

		var titleField = new JTextField(20);
		labelItem("Item Name", titleField);

		var imageUrl = new JTextField(20);
		labelItem("Image URL", imageUrl);

		var priceField = new JTextField(5);
		labelItem("Price ($)", priceField);

		var descField = new JTextArea(10, 20);
		labelItem("Description", descField);

		createHNavMenu("Cancel", "Publish");

		createFooter("DigiBay (c) 2024");

		display();
	}

	void labelItem(String s, Component c)
	{
		var label = new FLabel(s);
		var group = new LPanel();
		group.putLayout(new VLayout(group));
		group.addItem(label);
		group.addItem(c);
		addItem(group);
	}

	public void event(String e)
	{
	}
}
