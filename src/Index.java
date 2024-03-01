import system.*;
import component.*;
import layout.*;
import view.*;

public class Index extends Page
{
	ProductDatabase pdb;

	Index()
	{
		super("Index Page", 480, 360);

		var cfg = new ConfigDatabase();
		pdb = new ProductDatabase(cfg.get().products);
		
		putLayout(new VLayout(content));

		createHeader("DigiBay");

		createSubtitle("your one stop digital store");
		
		createHNavMenu("Search", "Post", "Settings");

		addItem(new FLabel("Available Items", FLabel.CENTER));

		var gallery = new ScrollView();

		for (Product p : pdb.getList())
		{
			var name = p.getName();
			var desc = p.getDescription();
			var price = p.getPrice();
			var icon = new ILabel("./assets/icon.jpg", 50, 50);
			var item = new ItemCard(icon, name, desc, price);
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
			case "Search":
				break;
			case "Post":
				new Post();
				fork();
				dispose();
				break;
			case "Settings":
				new Settings();
				break;
		}
	}
}
