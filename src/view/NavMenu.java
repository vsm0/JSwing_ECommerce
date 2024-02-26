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

	public void addBtn(String s)
	{
		addItem(new LButton(s, window));
	}
}

