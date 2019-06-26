package test;

import java.util.HashMap;
            

public class MessTag {
	/*
	 * Переменная которая содержит все
	 */
	public HashMap<String,HashMap<String,String>> tag=new HashMap<>();
	/*
	 * Переменная которая содержит ключи и значения,
	 * например ключ=currentDate,Значение=текущая дата(на определенном языке)
	 */
	public HashMap<String,String> tagsValue=new HashMap<>();
	
		public void setTags() {
			tagsValue.put("class",this.getClass().getSimpleName());
			tagsValue.put("id",this.getClass().getSimpleName());		
			tagsValue.put("style",this.getClass().getSimpleName());		
			tag.put(this.getClass().getSimpleName(),tagsValue);
		}
		//Функция возвращающая теговые значения
		public String keyTag(String key,String secondKey) {
			setTags();
			return tag.get(key).get(secondKey);
		}					
}
