package test;

import java.util.HashMap;

public class CurrentDate extends MessTag implements HashMess {
	public HashMap<String,String> curDate;
	String lang;
	public CurrentDate(String lang) {
		this.lang=lang;
		
	}
	@Override	
	public void setValue() {
		if(lang.equals("ru")) {
		curDate.put("curDate","текущаяДата");
		}else {
			curDate.put("curDate", "currentDate");
		}
	}
	//Тут должно возвращаться значение по ключу,но метод setValue нигде не исполняется,
	//т.к почему-то не работает,я пробывал его засунуть в конструктор этого класса,но сервер выдает ошибку(Cant instantiate class: test.Clock.)
	//Поэтому пока что просто выводится текст 
	@Override
	public String getText(String key) {
		return key;
	}
		
		
}
