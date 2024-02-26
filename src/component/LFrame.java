package component;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import layout.*;

public abstract class LFrame extends JFrame implements ActionListener
{
	protected LPanel content;

	public abstract void event(String e);

	public void actionPerformed(ActionEvent e)
	{
		event(e.getActionCommand());
	}

	public LFrame(String title, int w, int h)
	{
		super(title);

		content = new LPanel();
		add(content);

		setSize(w, h);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void putLayout(Layout layout)
	{
		content.putLayout(layout);
	}

	public void display()
	{
		toFront();
		requestFocus();
		setVisible(true);
	}

	public void fork()
	{
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void close()
	{
		setVisible(false);
		dispose();
	}

	public void addItem(Component c)
	{
		content.addItem(c);
	}
}
