package model;

import java.awt.event.*;
import javax.swing.*;

public class LButton extends LPanel
{
	JButton btn = new JButton();

	public LButton(String s, ActionListener w)
	{
		super();

		putLayout(new FLayout(this, FLayout.CENTER));

		init(s, w);

		addItem(btn);
	}

	public LButton()
	{
		super();

		putLayout(new FLayout(this, FLayout.CENTER));

		addItem(btn);
	}

	public void init(String s, ActionListener w)
	{
		btn.setText(s);
		btn.addActionListener(w);
	}
}
