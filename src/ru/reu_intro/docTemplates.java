package ru.reu_intro;

import java.util.ArrayList;
import java.util.Arrays;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.Label;
import com.vaadin.ui.RichTextArea;

public class docTemplates extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private HorizontalSplitPanel horizontalSplitPanel_1;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Button button_1;
	@AutoGenerated
	private RichTextArea richTextArea_3;
	@AutoGenerated
	private GridLayout gridLayout_3;
	@AutoGenerated
	private Button button_5;
	@AutoGenerated
	private ComboBox comboBox_3;
	@AutoGenerated
	private Label label_6;
	@AutoGenerated
	private Label label_7;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public docTemplates() {
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
		
		// horizontalSplitPanel_1
		horizontalSplitPanel_1 = buildHorizontalSplitPanel_1();
		mainLayout.addComponent(horizontalSplitPanel_1,
				"top:0.0px;right:-18.0px;bottom:-2.0px;left:20.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private HorizontalSplitPanel buildHorizontalSplitPanel_1() {
		// common part: create layout
		horizontalSplitPanel_1 = new HorizontalSplitPanel();
		horizontalSplitPanel_1.setImmediate(false);
		horizontalSplitPanel_1.setWidth("100.0%");
		horizontalSplitPanel_1.setHeight("100.0%");
		horizontalSplitPanel_1.setMargin(false);
		
		// gridLayout_3
		gridLayout_3 = buildGridLayout_3();
		horizontalSplitPanel_1.addComponent(gridLayout_3);
		
		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		horizontalSplitPanel_1.addComponent(gridLayout_1);
		
		return horizontalSplitPanel_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_3() {
		// common part: create layout
		gridLayout_3 = new GridLayout();
		gridLayout_3.setImmediate(false);
		gridLayout_3.setWidth("100.0%");
		gridLayout_3.setHeight("100.0%");
		gridLayout_3.setMargin(false);
		gridLayout_3.setColumns(20);
		gridLayout_3.setRows(20);
		
		// label_7
		label_7 = new Label();
		label_7.setImmediate(false);
		label_7.setWidth("-1px");
		label_7.setHeight("-1px");
		label_7.setValue("<h2>������� ����������</h2>");
		label_7.setContentMode(3);
		gridLayout_3.addComponent(label_7, 5, 1);
		
		// label_6
		label_6 = new Label();
		label_6.setImmediate(false);
		label_6.setWidth("56px");
		label_6.setHeight("-1px");
		label_6.setValue("�������� ������");
		gridLayout_3.addComponent(label_6, 4, 9);
		
		// comboBox_3
		comboBox_3 = new ComboBox();
		comboBox_3.setImmediate(false);
		comboBox_3.setWidth("227px");
		comboBox_3.setHeight("-1px");
		comboboxData.fillCombobox(comboBox_3, new ArrayList<String>(Arrays.asList("�������-���������������� ���������", "������� ����������� ���������", "����������", "������������")));
		gridLayout_3.addComponent(comboBox_3, 5, 9);
		
		// button_5
		button_5 = new Button();
		button_5.setCaption("�������(.doc)");
		button_5.setImmediate(true);
		button_5.setWidth("-1px");
		button_5.setHeight("-1px");
		gridLayout_3.addComponent(button_5, 5, 10);
		
		return gridLayout_3;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setRows(2);
		
		// richTextArea_3
		richTextArea_3 = new RichTextArea();
		richTextArea_3.setImmediate(false);
		richTextArea_3.setWidth("100.0%");
		richTextArea_3.setHeight("440px");
		gridLayout_1.addComponent(richTextArea_3, 0, 0);
		
		// button_1
		button_1 = new Button();
		button_1.setCaption("���������");
		button_1.setImmediate(true);
		button_1.setWidth("-1px");
		button_1.setHeight("-1px");
		gridLayout_1.addComponent(button_1, 0, 1);
		gridLayout_1.setComponentAlignment(button_1, new Alignment(48));
		
		return gridLayout_1;
	}

}