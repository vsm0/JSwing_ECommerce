import java.awt.*;
import javax.swing.*;

public class Index extends Page
{
	Index()
	{
		super("Index Page");
		
		putLayout(new VLayout(content));

		createHeader("DigiBay");

		createSubtitle("your one stop digital store");
		
		createHNavMenu("Search", "Post", "Settings");

		addItem(new FLabel("Available Items", FLabel.CENTER));

		var gallery = new ScrollView();

		for (int i = 0; i < 20; i++)
			gallery.addItem(new ItemCard(new ILabel("./assets/icon.jpg", 50, 50), this));

		addItem(gallery.getView());

		createFooter("DigiBay (c) 2024");
		
		display();
	}

	void event(String e)
	{
		switch (e)
		{
			case "Post":
				new Post();
				break;
			case "Settings":
				new Settings();
				break;
		}
	}
}
