import component.*;
import layout.*;
import view.*;

import system.*;

public class Index extends Page
{
	ProductDatabase pdb;

	Index()
	{
		super("Index Page", 480, 360);
		
		putLayout(new VLayout(content));

		createHeader("DigiBay");

		createSubtitle("your one stop digital store");
		
		createHNavMenu("Search", "Post", "Settings");

		addItem(new FLabel("Available Items", FLabel.CENTER));

		pdb = new ProductDatabase("./data/products.json");

		var gallery = new ScrollView();

		for (Product p : pdb.getList())
		{
			var name = p.getName();
			var desc = p.getDescription();
			var price = p.getPrice();
			var icon = new ILabel("./assets/icon.jpg", 50, 50);
			var item = new ItemCard(this, icon, name, desc, price);
			gallery.addItem(item);
		}

		addItem(gallery.getView());

		createFooter("DigiBay (c) 2024");
		
		display();
	}

	public void event(String e)
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
