package test;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Clock{
	
	public ArrayList<Nod> arrayNod=new ArrayList<>();
	//Пока что один nod 
	public Clock() {
		arrayNod.add(new Nod());
	}
	public ArrayList<Nod> getArrayNod(){
		return arrayNod;
	}
	
	
}
