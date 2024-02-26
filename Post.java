import java.awt.*;
import javax.swing.*;

public class Post extends Page
{
	Post()
	{
		super("Post Page");

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

		display(360, 480);
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

	void event(String e)
	{
	}
}
