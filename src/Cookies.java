import component.*;
import layout.*;

public class Cookies extends Page
{
	Cookies()
	{
		super("Account Control Page");

		putLayout(new VLayout(content));

		createHeader("DigiBay - Account Center");

		createHNavMenu("Login", "Register");

		createFooter("DigiBay (c) 2024");

		display(360, 240);	
	}

	public void event(String e)
	{
	}
}