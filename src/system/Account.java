package system;

public class Account
{
	protected String name;
	protected String password;

	public Account(String name, String password)
	{
		this.name = name;
		this.password = password;
	}

	public boolean compareName(String name)
	{
		return this.name.equals(name);
	}

	public boolean comparePassword(String password)
	{
		return Hash.parse(password).equals(this.password);
	}
}
