package ru.reu_intro;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

public class news extends CustomComponent {

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private TabSheet tabSheet_1;
	@AutoGenerated
	private Panel panel_2;
	@AutoGenerated
	private VerticalLayout verticalLayout_2;
	@AutoGenerated
	private GridLayout gridLayout_1;
	@AutoGenerated
	private Label label_3;
	@AutoGenerated
	private Label label_1;
	@AutoGenerated
	private Panel panel_1;
	@AutoGenerated
	private VerticalLayout verticalLayout_1;
	@AutoGenerated
	private GridLayout gridLayout_2;
	@AutoGenerated
	private Label label_8;
	@AutoGenerated
	private Label label_5;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public news() {
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
		
		// tabSheet_1
		tabSheet_1 = buildTabSheet_1();
		mainLayout.addComponent(tabSheet_1, "top:0.0px;left:0.0px;");
		
		return mainLayout;
	}

	@AutoGenerated
	private TabSheet buildTabSheet_1() {
		// common part: create layout
		tabSheet_1 = new TabSheet();
		tabSheet_1.setImmediate(true);
		tabSheet_1.setWidth("100.0%");
		tabSheet_1.setHeight("100.0%");
		
		// panel_1
		panel_1 = buildPanel_1();
		tabSheet_1.addTab(panel_1, "�������", null);
		
		// panel_2
		panel_2 = buildPanel_2();
		tabSheet_1.addTab(panel_2, "������", null);
		
		return tabSheet_1;
	}

	@AutoGenerated
	private Panel buildPanel_1() {
		// common part: create layout
		panel_1 = new Panel();
		panel_1.setImmediate(false);
		panel_1.setWidth("100.0%");
		panel_1.setHeight("100.0%");
		
		// verticalLayout_1
		verticalLayout_1 = buildVerticalLayout_1();
		panel_1.setContent(verticalLayout_1);
		
		return panel_1;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_1() {
		// common part: create layout
		verticalLayout_1 = new VerticalLayout();
		verticalLayout_1.setImmediate(false);
		verticalLayout_1.setWidth("100.0%");
		verticalLayout_1.setHeight("100.0%");
		verticalLayout_1.setMargin(false);
		
		// gridLayout_2
		gridLayout_2 = buildGridLayout_2();
		verticalLayout_1.addComponent(gridLayout_2);
		verticalLayout_1.setExpandRatio(gridLayout_2, 1.0f);
		
		return verticalLayout_1;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_2() {
		// common part: create layout
		gridLayout_2 = new GridLayout();
		gridLayout_2.setImmediate(false);
		gridLayout_2.setWidth("100.0%");
		gridLayout_2.setHeight("100.0%");
		gridLayout_2.setMargin(false);
		gridLayout_2.setColumns(25);
		gridLayout_2.setRows(25);
		
		// label_5
		label_5 = new Label();
		label_5.setImmediate(false);
		label_5.setWidth("-1px");
		label_5.setHeight("-1px");
		label_5.setValue("<img src=\"http://rea.ru/SystemFiles/flag/univer106.png\" alt=\"��� ��.�.�.���������\" style=\"border:0px;\"/>");
		label_5.setContentMode(3);
		gridLayout_2.addComponent(label_5, 12, 1);
		gridLayout_2.setComponentAlignment(label_5, new Alignment(20));
		
		// label_8
		label_8 = new Label();
		label_8.setImmediate(false);
		label_8.setWidth("756px");
		label_8.setHeight("-1px");
		label_8.setValue("<div class=\"newsitem\"><div class=\"newsitemdate\">11.12.2013 16:28</div><div class=\"newsitemtitle\"><a href=\"http://www.rea.ru/Main.aspx?page=REA_NEWS&NewsItem=7663\" ><p>������� � ��� ���������� ��������� ������������� �������������� ����� �� ���� &laquo;���������-������������� ������� �������������� ����� �����&raquo;</p></a></div></div><div class=\"newsitem\"><div class=\"newsitemdate\">11.12.2013 15:08</div><div class=\"newsitemtitle\"><a href=\"http://www.rea.ru/Main.aspx?page=REA_NEWS&NewsItem=7662\" ><p>���������� �������� �������� � ��� ��� ��. �.�. ��������� �.�. ������ �������� �� ������� ����� � ��� �������</p></a></div></div><div class=\"newsitem\"><div class=\"newsitemdate\">11.12.2013 10:53</div><div class=\"newsitemtitle\"><a href=\"http://www.rea.ru/Main.aspx?page=REA_NEWS&NewsItem=7661\" ><p>� ������-������� ������ �� �������������� � ��������� ������������ ���������� ������ ����� ������ ������ ��������� �������� �� ��������� &laquo;����������������� ��������������� �������� � ������������ � ������������ ����&raquo;</p></a></div></div><div class=\"newsitem\">");
		label_8.setContentMode(3);
		gridLayout_2.addComponent(label_8, 12, 2);
		gridLayout_2.setComponentAlignment(label_8, new Alignment(48));
		
		return gridLayout_2;
	}

	@AutoGenerated
	private Panel buildPanel_2() {
		// common part: create layout
		panel_2 = new Panel();
		panel_2.setImmediate(false);
		panel_2.setWidth("100.0%");
		panel_2.setHeight("100.0%");
		
		// verticalLayout_2
		verticalLayout_2 = buildVerticalLayout_2();
		panel_2.setContent(verticalLayout_2);
		
		return panel_2;
	}

	@AutoGenerated
	private VerticalLayout buildVerticalLayout_2() {
		// common part: create layout
		verticalLayout_2 = new VerticalLayout();
		verticalLayout_2.setImmediate(false);
		verticalLayout_2.setWidth("100.0%");
		verticalLayout_2.setHeight("100.0%");
		verticalLayout_2.setMargin(false);
		
		// gridLayout_1
		gridLayout_1 = buildGridLayout_1();
		verticalLayout_2.addComponent(gridLayout_1);
		verticalLayout_2.setExpandRatio(gridLayout_1, 1.0f);
		
		return verticalLayout_2;
	}

	@AutoGenerated
	private GridLayout buildGridLayout_1() {
		// common part: create layout
		gridLayout_1 = new GridLayout();
		gridLayout_1.setImmediate(false);
		gridLayout_1.setWidth("100.0%");
		gridLayout_1.setHeight("100.0%");
		gridLayout_1.setMargin(true);
		gridLayout_1.setColumns(25);
		gridLayout_1.setRows(25);
		
		// label_1
		label_1 = new Label();
		label_1.setImmediate(false);
		label_1.setWidth("647px");
		label_1.setHeight("243px");
		label_1.setValue("<p style=\"text-align: center;\"><img src=\" http://www.rea.ru/UserFiles/uk/KYRS%20A.jpg\" alt=\"\" width=\"350\" height=\"189\" /></p>");
		label_1.setContentMode(3);
		gridLayout_1.addComponent(label_1, 2, 3);
		gridLayout_1.setComponentAlignment(label_1, new Alignment(20));
		
		// label_3
		label_3 = new Label();
		label_3.setImmediate(false);
		label_3.setWidth("279px");
		label_3.setHeight("243px");
		label_3.setValue("<a href=\"http://www.rea.ru/Main.aspx?page=FPP_NEWS&amp;NewsItem=7503\" target=\"_blank\"><img src=\"http://www.rea.ru/UserFiles/uk/spetz.jpg\" border=\"0\" alt=\"\" width=\"320\" height=\"187\" /></a></p>");
		label_3.setContentMode(3);
		gridLayout_1.addComponent(label_3, 2, 13);
		gridLayout_1.setComponentAlignment(label_3, new Alignment(24));
		
		return gridLayout_1;
	}

}
