package test;


import java.util.HashMap;

public class Lang {
	HashMap<String,String> langArray;
		public String getLang(String key) {
			//пока что вбил вручную,далее будет метод в классе translator для выборки всех языков
			langArray.put("Русский","ru");
			langArray.put("Английский","en");
			langArray.put("Арабский","ar");
			langArray.put("Татарский","tat");
			//Проверка на наличие такого языка
			if(!langArray.get(key).isEmpty()) 
			{
			return langArray.get(key);
			}
			else 
			{
				return null;
			}
		}
}