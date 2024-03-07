package controller;

import view.*;

import javax.swing.*;

public class Main extends JFrame
{
	public static void main(String... args)
	{
		new ConfigDatabase("src/main/resources/data/config.json");

		SwingUtilities.invokeLater(
			() -> new Index()
		);
	}
}
