package view;

import java.awt.*;
import javax.swing.*;

import component.*;
import layout.*;

public class ScrollView extends LPanel
{
	public ScrollView()
	{
		super();

		putLayout(new VLayout(this));
	}

	public JScrollPane getView()
	{
		return new JScrollPane(this);
	}
}
