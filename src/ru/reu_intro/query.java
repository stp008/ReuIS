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
import com.vaadin.ui.Label;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.Upload;

public class query extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Button button_1;
	@AutoGenerated
	private Upload upload_1;
	@AutoGenerated
	private Label label_5;
	@AutoGenerated
	private TextArea textArea_1;
	@AutoGenerated
	private Label label_4;
	@AutoGenerated
	private TextField textField_1;
	@AutoGenerated
	private Label label_3;
	@AutoGenerated
	private ComboBox comboBox_2;
	@AutoGenerated
	private Label label_2;
	@AutoGenerated
	private ComboBox comboBox_1;
	@AutoGenerated
	private Label label_1;
	@AutoGenerated
	private Label label_6;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public query() {
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
		mainLayout.addComponent(gridLayout_1,
				"top:0.0px;right:1.0px;bottom:-3.0px;left:0.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(false);
		gridLayout_1.setColumns(15);
		gridLayout_1.setRows(25);
		
		// label_6
		label_6 = new Label();
		label_6.setImmediate(false);
		label_6.setWidth("-1px");
		label_6.setHeight("-1px");
		label_6.setValue("<h1>�������</h1>");
		label_6.setContentMode(3);
		gridLayout_1.addComponent(label_6, 7, 1);
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("-1px");
		label_1.setHeight("-1px");
		label_1.setValue("����");
		gridLayout_1.addComponent(label_1, 6, 3);
		gridLayout_1.setComponentAlignment(label_1, new Alignment(20));
		
		// comboBox_1
		comboBox_1 = new ComboBox();
		comboBox_1.setImmediate(false);
		comboBox_1.setWidth("260px");
		comboBox_1.setHeight("-1px");
		comboboxData.fillCombobox(comboBox_1, new ArrayList<String>(Arrays.asList("���������� ����","����. �����","����������","����������", "�����������", "���� ���������")));
		gridLayout_1.addComponent(comboBox_1, 7, 3);
		
		// label_2
		label_2 = new Label();
		label_2.setImmediate(false);
		label_2.setWidth("-1px");
		label_2.setHeight("-1px");
		label_2.setValue("�� ����");
		gridLayout_1.addComponent(label_2, 6, 4);
		gridLayout_1.setComponentAlignment(label_2, new Alignment(20));
		
		// comboBox_2
		comboBox_2 = new ComboBox();
		comboBox_2.setImmediate(false);
		comboBox_2.setWidth("260px");
		comboBox_2.setHeight("-1px");
		comboboxData.fillCombobox(comboBox_2, new ArrayList<String>(Arrays.asList("���������","���������")));
		gridLayout_1.addComponent(comboBox_2, 7, 4);
		
		// label_3
		label_3 = new Label();
		label_3.setImmediate(false);
		label_3.setWidth("-1px");
		label_3.setHeight("-1px");
		label_3.setValue("��� ����������");
		gridLayout_1.addComponent(label_3, 6, 5);
		gridLayout_1.setComponentAlignment(label_3, new Alignment(20));
		
		// textField_1
		textField_1 = new TextField();
		textField_1.setImmediate(false);
		textField_1.setWidth("260px");
		textField_1.setHeight("-1px");
		gridLayout_1.addComponent(textField_1, 7, 5);
		
		// label_4
		label_4 = new Label();
		label_4.setImmediate(false);
		label_4.setWidth("-1px");
		label_4.setHeight("-1px");
		label_4.setValue("����� �������");
		gridLayout_1.addComponent(label_4, 6, 6);
		gridLayout_1.setComponentAlignment(label_4, new Alignment(20));
		
		// textArea_1
		textArea_1 = new TextArea();
		textArea_1.setImmediate(false);
		textArea_1.setWidth("262px");
		textArea_1.setHeight("-1px");
		gridLayout_1.addComponent(textArea_1, 7, 6);
		
		// label_5
		label_5 = new Label();
		label_5.setImmediate(false);
		label_5.setWidth("-1px");
		label_5.setHeight("-1px");
		label_5.setValue("���������� ����");
		gridLayout_1.addComponent(label_5, 6, 7);
		gridLayout_1.setComponentAlignment(label_5, new Alignment(20));
		
		// upload_1
		upload_1 = new Upload();
		upload_1.setImmediate(false);
		upload_1.setWidth("-1px");
		upload_1.setHeight("32px");
		gridLayout_1.addComponent(upload_1, 7, 7);
		
		// button_1
		button_1 = new Button();
		button_1.setCaption("���������");
		button_1.setImmediate(true);
		button_1.setWidth("-1px");
		button_1.setHeight("-1px");
		gridLayout_1.addComponent(button_1, 7, 8);
		
		return gridLayout_1;
	}

}