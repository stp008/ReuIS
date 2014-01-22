package ru.reu_intro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;

public class events extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Button button_5;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Table table_2;
	@AutoGenerated
	private InlineDateField inlineDateField_2;
	@AutoGenerated
	private Label label_1;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public events() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setMargin(false);
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		mainLayout.addComponent(gridLayout_1, "top:0.0px;left:0.0px;");
		
		// button_5
		button_5 = new Button();
		button_5.setCaption("�������� �������");
		button_5.setImmediate(true);
		button_5.setWidth("230px");
		button_5.setHeight("-1px");
		mainLayout.addComponent(button_5, "top:454.0px;left:220.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("680px");
		gridLayout_1.setHeight("440px");
		gridLayout_1.setMargin(false);
		gridLayout_1.setSpacing(true);
		gridLayout_1.setColumns(3);
		gridLayout_1.setRows(3);
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("<h1>�������</h1>");
		label_1.setContentMode(3);
		gridLayout_1.addComponent(label_1, 1, 0);
		gridLayout_1.setComponentAlignment(label_1, new Alignment(20));
		
		// inlineDateField_2
		inlineDateField_2 = new InlineDateField();
		inlineDateField_2.setImmediate(false);
		inlineDateField_2.setWidth("-1px");
		inlineDateField_2.setHeight("174px");
		inlineDateField_2.setResolution(4);
		gridLayout_1.addComponent(inlineDateField_2, 1, 1);
		gridLayout_1
				.setComponentAlignment(inlineDateField_2, new Alignment(20));
		
		// table_2
		table_2 = new Table();
		table_2.setImmediate(false);
		table_2.setWidth("100.0%");
		table_2.setHeight("146px");
		tableData.initProperties(table_2, new String[]{"�������� �������", "����� ������", "����� �����", "���������"});
		tableData.fillTable(table_2, new String[][]{{"����������� �racle","8:30","10:00","314 4k"},{"������ �� Microsoft", "10:10", "11:50", "452"}, {"MBA","11:50","13:20","652"}}, 3);
		gridLayout_1.addComponent(table_2, 1, 2);
		gridLayout_1.setComponentAlignment(table_2, new Alignment(48));
		
		return gridLayout_1;
	}

}