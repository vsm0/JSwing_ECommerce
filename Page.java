import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Page extends LFrame
{
	Page(String title)
	{
		super(title);
	}

	void createHeader(String s)
	{
		var label = new FLabel(s, FLabel.CENTER);
		label.putFont(new Font("Arial", Font.BOLD, 18));
		content.addItem(label);
	}

	void createSubtitle(String s)
	{
		var label = new FLabel("your one stop digital store", FLabel.CENTER);
		label.putFont(new Font("Arial", Font.ITALIC, 14));
		content.addItem(label);
	}

	void createFooter(String s)
	{
		var label = new FLabel("DigiBay (c) 2024", FLabel.CENTER);
		label.putFont(new Font("Arial", Font.ITALIC, 12));
		content.addItem(label);
	}

	void createVNavMenu(String... args)
	{
		var menu = new NavMenu(this);
		menu.putLayout(new VLayout(menu));
		for (String s : args)
			menu.addBtn(s);
		content.addItem(menu);
	}

	void createHNavMenu(String... args)
	{
		var menu = new NavMenu(this);
		menu.putLayout(new HLayout(menu));
		for (String s : args)
			menu.addBtn(s);
		content.addItem(menu);
	}
}
