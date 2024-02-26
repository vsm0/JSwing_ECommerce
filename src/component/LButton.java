package component;

import java.awt.event.*;
import javax.swing.*;

import layout.*;

public class LButton extends LPanel
{
	public LButton(String s, ActionListener w)
	{
		super();

		putLayout(new FLayout(this, FLayout.CENTER));

		var btn = new JButton(s);
		btn.addActionListener(w);

		addItem(btn);
	}
}
