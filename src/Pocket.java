import component.*;
import layout.*;
import view.*;
import system.*;

public class Pocket extends Page
{
	public Pocket()
	{
		super("Cart Page", 300, 500);

		putLayout(new VLayout(content));

		var cfg = new ConfigDatabase();
		var pdb = new ProductDatabase(
			cfg.get().products
		);

		createHeader("DigiBay - Cart");

		createSubtitle("Item List");

		double totalPrice = 0.0;
		int itemIndex = 0;

		var gallery = new ScrollView();

		for (Product p : pdb.getList())
		{
			var name = p.getName();
			var price = p.getPrice();

			totalPrice += Double.valueOf(price);

			var item = new CheckoutCard(++itemIndex, name, price);
			gallery.addItem(item);
		}
		
		addItem(gallery.getView());

		var priceLabel = new FLabel("Total price: $" + totalPrice, FLabel.CENTER);
		var menu = new NavMenu();
		menu.putLayout(new HLayout(menu));

		menu.addBtn()
			.init("Cancel", e -> cancel());
		menu.addBtn()
			.init("Checkout", e -> buyAll());

		addItem(priceLabel);
		addItem(menu);

		createFooter("DigiBay (c) 2024");

		fork();
		display();
	}

	void cancel()
	{
		fork();
		dispose();
	}

	void buyAll()
	{
		cancel();
	}

	public void event(String e)
	{
	}
}
