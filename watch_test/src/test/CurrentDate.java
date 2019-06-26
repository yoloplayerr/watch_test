package test;



public class CurrentDate extends MessTag {
	
	
	public CurrentDate(String lang) {
		if(lang.equals("ru")) {
			tagsValue.put("text","на русском");
			tag.put(this.getClass().getSimpleName(), tagsValue);
		}else {
			tagsValue.put("text","на татарском");
			tag.put(this.getClass().getSimpleName(), tagsValue);
		}
		
	}			
}
