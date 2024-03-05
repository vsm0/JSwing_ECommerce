import component.*;
import layout.*;

public class Settings extends Page
{
	Settings()
	{
		super("Settings Page", 360, 480);

		putLayout(new VLayout(content));

		createHeader("DigiBay - Settings");

		createVNavMenu("Account", "Pocket", "History", "Wallet", "Preferences", "Close");

		createFooter("DigiBay (c) 2024");
		
		display();
	}

	public void event(String e)
	{
		switch (e)
		{
			case "Account":
				fork();
				new Cookies();
				dispose();
				break;

			case "Pocket":
				fork();
				new Pocket();
				dispose();
				break;
		}
	}
}
