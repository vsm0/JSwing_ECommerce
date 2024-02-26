package layout;

import java.awt.*;

import component.*;

public class FLayout extends FlowLayout implements Layout
{
	LPanel panel;
	public static final int CENTER = FlowLayout.CENTER;
	public static final int LEFT = FlowLayout.LEFT;
	public static final int RIGHT = FlowLayout.RIGHT;

	public FLayout(LPanel p, int align)
	{
		super(align);

		panel = p;
	}

	public void add(Component c)
	{
		panel.add(c);
	}
}
