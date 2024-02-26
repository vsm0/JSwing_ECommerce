package component;

import java.awt.*;
import javax.swing.*;

import layout.*;

public class FLabel extends LPanel
{
	JLabel label = new JLabel();

	public static final int CENTER = FLayout.CENTER;
	public static final int LEFT = FLayout.LEFT;
	public static final int RIGHT = FLayout.RIGHT;

	void create(String s, int align)
	{
		putLayout(new FLayout(this, align));
		label = new JLabel(s);
		addItem(label);
	}

	public FLabel(String s, int align)
	{
		super();
		
		create(s, align);
	}

	public FLabel(String s)
	{
		super();

		create(s, LEFT);
	}

	public void putFont(Font f)
	{
		label.setFont(f);
	}
}
