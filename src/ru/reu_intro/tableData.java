package ru.reu_intro;

import java.lang.Math;
import com.vaadin.ui.Table;

public class tableData {

	public static void initProperties(Table table, Object[] properties) {
        for (int i=0; i<properties.length; i++) {
        	table.addContainerProperty(properties[i], Object.class,  null);
        }   
        table.setSelectable(true);
    }
	
	 public static void fillTable(Table table, Object[][] data) {        
        for (int i = 0; i < 300; i++) {
        	int randomRow = ((int)(Math.random() * data.length));
        	table.addItem(data[randomRow], null);
        }

    }
	 
	 public static void fillTable(Table table, Object[][] data, int loops) {        
	        for (int i = 0; i < loops; i++) {
	        	int randomRow = ((int)(Math.random() * data.length));
	        	table.addItem(data[randomRow], null);
	        }    	
	 }
	 
}
