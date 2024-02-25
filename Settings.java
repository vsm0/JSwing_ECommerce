import java.awt.*;
import javax.swing.*;

public class Settings extends Page
{
	Settings()
	{
		super("Settings Page");

		putLayout(new VLayout(content));

		createHeader("DigiBay - Settings");

		createVNavMenu("Account", "Pocket", "History", "Wallet", "Preferences", "Close");

		createFooter("DigiBay (c) 2024");
		
		display();
	}

	void event(String e)
	{
		switch (e)
		{
			case "Account":
				new Cookies();
				break;
		}
	}
}
