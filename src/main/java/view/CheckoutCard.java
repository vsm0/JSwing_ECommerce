package view;

import model.*;

public class CheckoutCard extends LPanel
{
	public CheckoutCard(int index, String name, String price)
	{
		super();

		putLayout(new VLayout(this));

		var idLabel = new FLabel(index +  ". " + name);
		var priceLabel = new FLabel("$" + price, FLabel.RIGHT);

		addItem(idLabel);
		addItem(priceLabel);
	}
}
