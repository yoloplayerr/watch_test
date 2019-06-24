package test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Panel extends MessTag{
	CurrentDate curDate;
	//Конструктор,не знаю почему программа ругаеться,но без этого конструктора выкидывает ошибку
	public Panel() {
		
	}
	//Я сразу передаю язык все обьектам(можно ли так?)
	//Тут будут инициализироваться все нужные обьекты(намаз текущая дата и тд)
	public Panel(String lang) {
		curDate=new CurrentDate(lang);
		
	}
	public CurrentDate getCurDate() {
		return curDate;
	}
	

	

}
