package view;

import java.awt.event.*;
import javax.swing.*;

import component.*;

public class NavMenu extends LPanel
{
	ActionListener window;

	public NavMenu(ActionListener w)
	{
		super();

		window = w;
	}

	public NavMenu()
	{
		super();
	}

	public void addBtn(String s)
	{
		addItem(new LButton(s, window));
	}

	public LButton addBtn()
	{
		var button = new LButton();
		addItem(button);
		return button;
	}
}

