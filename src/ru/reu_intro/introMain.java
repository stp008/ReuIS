package ru.reu_intro;

import java.util.Iterator;

import com.vaadin.Application;
import com.vaadin.terminal.ExternalResource;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.AbstractComponent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Panel;
import com.vaadin.ui.SplitPanel;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Button.ClickEvent;

public class introMain extends Application {

    VerticalLayout main = new VerticalLayout();

    @Override
    public void init() {
        setTheme("reindeermods");
        Window mainWindow = new Window("АИС Деканат", main);       
        setMainWindow(mainWindow);
        main.setSizeFull();

        CssLayout toolbar = new CssLayout();
        toolbar.setWidth("100%");
        toolbar.addStyleName("toolbar-invert");

        CssLayout right = new CssLayout();
        right.setSizeUndefined();
        right.addStyleName("right");
        toolbar.addComponent(right);

        Label text = new Label("Факультет математической экономики и информатики РЭУ им. Г.В. Плеханова");
        right.addComponent(text);  

        CssLayout left = new CssLayout();
        left.setSizeUndefined();
        left.addStyleName("left");
        toolbar.addComponent(left);

        Label title = new Label("АИС Деканат");
        title.addStyleName("h1");
        left.addComponent(title);

        main.addComponent(toolbar);

        final SplitPanel split = new SplitPanel(
                SplitPanel.ORIENTATION_HORIZONTAL);
        split.addStyleName("small blue white");
        split.setSplitPosition(14);
        main.addComponent(split);
        main.setExpandRatio(split, 1);

        CssLayout menu = new CssLayout();
        menu.addStyleName("menu");
        menu.setWidth("100%");
        split.setFirstComponent(menu);

        final Button.ClickListener change = new Button.ClickListener() {
            @Override
            public void buttonClick(ClickEvent event) {
                ComponentContainer p = (ComponentContainer) event.getButton()
                        .getParent();
                for (Iterator iterator = p.getComponentIterator(); iterator
                        .hasNext();) {
                    ((AbstractComponent) iterator.next())
                            .removeStyleName("selected");
                }
                event.getButton().addStyleName("selected");
                split.setSecondComponent((Component) event.getButton()
                        .getData());
            }
        };
    
        Label l = new Label("");
        l.addStyleName("section");
        menu.addComponent(l);

        VerticalLayout sample = new VerticalLayout();
        sample.addComponent(new Label("sample"));
        
        Button b = new NativeButton("Новости", change);
        b.addStyleName("selected");
        menu.addComponent(b);
        b.setData(new news());
        
        b = new NativeButton("События", change);
        menu.addComponent(b);
        b.setData(new events());
        
        b = new NativeButton("Шаблоны документов", change);
        menu.addComponent(b);
        b.setData(new docTemplates());
        
        b = new NativeButton("Информация", change);
        menu.addComponent(b);
        b.setData(new information());
        
        b = new NativeButton("Расписание", change);
        menu.addComponent(b);
        b.setData(new schedule());
        
        b = new NativeButton("База сотрудников", change);
        menu.addComponent(b);
        b.setData(new db());
        
        b = new NativeButton("Запросы", change);
        menu.addComponent(b);
        b.setData(new query());
        
        b = new NativeButton("Журнал посещений", change);
        menu.addComponent(b);
        b.setData(new attendance());
        
        b = new NativeButton("Мастер документов", change);
        menu.addComponent(b);
        b.setData(new taskCreator());
        
        b = new NativeButton("База документов", change);   
        b.setData(new docsBase());
        menu.addComponent(b);
        
        split.setSecondComponent(new news());

        

        l = new Label("РЭУ Им. Г.В.Плеханова");
        menu.addComponent(l);
        
       
    }
    

} 


