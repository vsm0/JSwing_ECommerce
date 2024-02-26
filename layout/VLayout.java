package layout;

import java.awt.*;
import component.*;

public class VLayout extends BLayout
{
	public VLayout(LPanel p)
	{
		super(p, V_ALIGN);
	}

	public void add(Component c)
	{
		panel.add(c);
		fill(0, 5);
	}
}

