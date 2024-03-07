package view;

import model.*;

public class Cookies extends Page
{
	Cookies()
	{
		super("Account Control Page", 360, 240);

		putLayout(new VLayout(content));

		createHeader("DigiBay - Account Center");

		createHNavMenu("Login", "Register");

		createFooter("DigiBay (c) 2024");

		display();	
	}

	public void event(String e)
	{
	}
}
