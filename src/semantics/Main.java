package semantics;


import java.util.ArrayList;

import readFromXML.Monier;


public class Main {
	
	private static ArrayList<Monier> mList= new ArrayList<Monier>();
	
	public static void main(String args[]){
	
/*		ReadXMLDOM handler = new ReadXMLDOM("monier.xml");
		//handler.displayList();
		mList = handler.getList(); 	
		
		
		MakeMap maps= new MakeMap(mList);
		maps.mapWM();*/
		
	
		GenerateSynonym gs= new GenerateSynonym();
		System.out.println("Generating synonyms");
		gs.synonymMap();
	
	}
		
}
