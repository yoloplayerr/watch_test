package test;

import java.util.HashMap;

//Класс Описывающий все обьекты 
//Тут мало методов,но я еще буду думать над тем из чего состоят,и какие методы имеют,чтобы дополнить этот класс
public class MessTag {
	/*
	 * Обьект хранящий название тега в качестве ключа 
	 * и название класса в качестве значения 
	 */
	private HashMap<String,String> tags=new HashMap<>();
	
		public String getTag(String param) {
				tags.put(param,this.getClass().getSimpleName());
			return tags.get(param);	
		}
		
	
}
