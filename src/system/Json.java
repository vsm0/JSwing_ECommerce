package system;

public class Json extends Gson
{
	public Gson prettier()
	{
		return GsonBuilder()
			.setPrettyPrinting()
			.create();
	}
}
