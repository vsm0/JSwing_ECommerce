package model;

import java.awt.*;

public class HLayout extends BLayout
{
	public HLayout(LPanel p)
	{
		super(p, H_ALIGN);
	}

	public void add(Component c)
	{	
		panel.add(c);
		fill(5, 0);
	}
}

