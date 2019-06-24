package test;

import java.util.ArrayList;
import java.util.Objects;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class Nod extends MessTag{
	public ArrayList<Panel> arrayPanel=new ArrayList<>();
	//Инициализация обьектов панель на разных языках
	public Nod() {
		arrayPanel.add(new Panel("ru"));
		arrayPanel.add(new Panel("tat"));			
	}
	public ArrayList<Panel> getArrayPanel(){
		return arrayPanel;
	}
	
	

	

}
