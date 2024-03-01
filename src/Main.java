import system.*;

import javax.swing.*;

public class Main extends JFrame
{
	public static void main(String... args)
	{
		new ConfigDatabase("./data/config.json");

		SwingUtilities.invokeLater(
			() -> new Index()
		);
	}
}
