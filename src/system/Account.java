package system;

public class Account
{
	private String name;
	private String password;

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
		return Hash.compare(this.password, password);
	}
}
