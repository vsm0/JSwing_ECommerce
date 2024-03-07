package view;

import model.*;

import java.awt.*;
import javax.swing.*;

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
