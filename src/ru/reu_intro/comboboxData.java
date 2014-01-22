package ru.reu_intro;

import java.util.List;

import com.vaadin.ui.ComboBox;

public class comboboxData {
  
	public static void fillCombobox (ComboBox combobox, List<?> data){
	combobox.setTextInputAllowed(false);	
	combobox.setValue(data.get(0));
	int size = data.size();
	for(int i=0; i<size; i++) {
	combobox.addItem(data.get(i));
	}
	}
}
