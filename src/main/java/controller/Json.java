package controller;

import com.google.gson.*;

public class Json
{
	public static Gson prettier()
	{
		return new GsonBuilder()
			.setPrettyPrinting()
			.create();
	}
}
