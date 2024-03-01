package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import component.*;
import layout.*;
import system.*;

public class ItemCard extends LPanel
{
	ProductDatabase pdb = new ProductDatabase("./data/products.json");
	ProductDatabase pocket = new ProductDatabase("./data/pocket.json");

	public ItemCard(String name, String description, String price, String url)
	{
		super();

		putLayout(new HLayout(this));

		var c1 = column();
		var icon = new ILabel(url, 50, 50);
		c1.addItem(icon);

		var c2 = column();
		label(c2, name, FLabel.LEFT, new Font("Arial", Font.BOLD, 16));
		label(c2, description, FLabel.LEFT, new Font("Arial", Font.ITALIC, 14));
		label(c2, "$" + price, FLabel.RIGHT, new Font("Monospaced", Font.BOLD, 14));

		var c3 = column();
		var optMenu = new NavMenu();
		optMenu.putLayout(new VLayout(optMenu));
		optMenu.addBtn()
			.init("Add to pocket", e -> pocketItem(name));
		optMenu.addBtn()
			.init("Buy", e -> buyItem(name));
		c3.addItem(optMenu);
	}

	public void label(LPanel panel, String s, int align, Font f)
	{
		var l = new FLabel(s, align);
		l.putFont(f);
		panel.addItem(l);
	}

	public void pocketItem(String s)
	{
		var item = pdb.getItem(s);
		var name = item.getName();
		var description = item.getDescription();
		var price = item.getPrice();
		var url = item.getImageUrl();
		pocket.createItem(name, description, price, url);
	}

	public void buyItem(String s)
	{
	}

	LPanel column()
	{
		var panel = new LPanel();
		panel.putLayout(new VLayout(panel));
		addItem(panel);
		return panel;
	}
}
