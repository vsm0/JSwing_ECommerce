package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import layout.*;
import view.*;

public abstract class Page extends LFrame
{
	public Page(String title, int w, int h)
	{
		super(title, w, h);
	}

	public abstract void event(String e);

	protected void createHeader(String s)
	{
		var label = new FLabel(s, FLabel.CENTER);
		label.putFont(new Font("Arial", Font.BOLD, 18));
		content.addItem(label);
	}

	protected void createSubtitle(String s)
	{
		var label = new FLabel(s, FLabel.CENTER);
		label.putFont(new Font("Arial", Font.ITALIC, 14));
		content.addItem(label);
	}

	protected void createFooter(String s)
	{
		var label = new FLabel("DigiBay (c) 2024", FLabel.CENTER);
		label.putFont(new Font("Arial", Font.ITALIC, 12));
		content.addItem(label);
	}

	protected void createVNavMenu(String... args)
	{
		var menu = new NavMenu(this);
		menu.putLayout(new VLayout(menu));
		for (String s : args)
			menu.addBtn(s);
		content.addItem(menu);
	}

	protected void createHNavMenu(String... args)
	{
		var menu = new NavMenu(this);
		menu.putLayout(new HLayout(menu));
		for (String s : args)
			menu.addBtn(s);
		content.addItem(menu);
	}
}
