package com.example.vaadindemo;


import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Accordion;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("vaadindemo")
public class VaadindemoUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = VaadindemoUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) 
	{
		final GridLayout pageLayout = new GridLayout(4, 3);
		pageLayout.setMargin(true);
		pageLayout.setSizeFull();
		pageLayout.setSpacing(true);
		setContent(pageLayout);
		
		Accordion acc = createAccordionMenu();
		pageLayout.addComponent(acc, 0, 0, 0, 1);
		
		Panel centerPanel = createCenterPanel();
		pageLayout.addComponent(centerPanel, 1, 0, 2, 2);
	}

	private Panel createCenterPanel() 
	{
		Panel centerPanel = new Panel();
		centerPanel.setSizeFull();
		GridLayout centerPanelLayout = new GridLayout(1, 3);
		centerPanelLayout.setSizeFull();
		centerPanel.setContent(centerPanelLayout);
		
		Label headerLabel = new Label("Welcome to Java Masters Learning Software");
		centerPanelLayout.addComponent(headerLabel);
		centerPanelLayout.setComponentAlignment(headerLabel, Alignment.MIDDLE_CENTER);
		
		return centerPanel;
	}
	
	private Accordion createAccordionMenu()
	{
		Accordion accordion = new Accordion();
		accordion.setWidth("300");
		accordion.setSizeFull();
		
		//Main Topic - Variables
		Panel mainTopic_Variables = new Panel();
		VerticalLayout variablesLayout = new VerticalLayout();
		mainTopic_Variables.setContent(variablesLayout);
		accordion.addTab(mainTopic_Variables, "Variables");
		
		Button subTopic_VarDec = createAccordionButton("Variable Declaring / Instantiation");
		variablesLayout.addComponent(subTopic_VarDec);
		Button subTopic_Int = createAccordionButton("Int");
		variablesLayout.addComponent(subTopic_Int);
		Button subTopic_DoubleFloat = createAccordionButton("Double / Float");
		variablesLayout.addComponent(subTopic_DoubleFloat);
		Button subTopic_StringChar = createAccordionButton("String / Char");
		variablesLayout.addComponent(subTopic_StringChar);
		Button subTopic_Boolean = createAccordionButton("Boolean");
		variablesLayout.addComponent(subTopic_Boolean);
		Button subTopic_Scanner = createAccordionButton("Scanner");
		variablesLayout.addComponent(subTopic_Scanner);
		
		
		//Main Topic - Control Statements 1
		Panel mainTopic_CS1 = new Panel();
		VerticalLayout controlStatements1Layout = new VerticalLayout();
		mainTopic_CS1.setContent(controlStatements1Layout);
		accordion.addTab(mainTopic_CS1, "Control Statements 1");
		
		Button subTopic_SelectionStatements = createAccordionButton("Selection Statements");
		controlStatements1Layout.addComponent(subTopic_SelectionStatements);
		Button subTopic_LogicOperators = createAccordionButton("Logic Operators");
		controlStatements1Layout.addComponent(subTopic_LogicOperators);
		Button subTopic_IncDec = createAccordionButton("Increment / Decrement");
		controlStatements1Layout.addComponent(subTopic_IncDec);
		
		
		//Main Topic - Control Statements 2
		Panel mainTopic_CS2 = new Panel();
		VerticalLayout controlStatements2Layout = new VerticalLayout();
		mainTopic_CS2.setContent(controlStatements2Layout);
		accordion.addTab(mainTopic_CS2, "Control Statements 2");
		
		Button subTopic_ForLoop = createAccordionButton("For Loop");
		controlStatements2Layout.addComponent(subTopic_ForLoop);
		Button subTopic_WhileDoWhile = createAccordionButton("While / Do While");
		controlStatements2Layout.addComponent(subTopic_WhileDoWhile);
		Button subTopic_ForEachLoop = createAccordionButton("For Each Loop");
		controlStatements2Layout.addComponent(subTopic_ForEachLoop);
		
		
		//Main Topic - Methods and Classes
		Panel mainTopic_MethodsClasses = new Panel();
		VerticalLayout methodsClassesLayout = new VerticalLayout();
		mainTopic_MethodsClasses.setContent(methodsClassesLayout);
		accordion.addTab(mainTopic_MethodsClasses, "Methods and Classes");
		
		Button subTopic_Classes = createAccordionButton("Classes - Declare/Create/Access");
		methodsClassesLayout.addComponent(subTopic_Classes);
		Button subTopic_Methods = createAccordionButton("Methods");
		methodsClassesLayout.addComponent(subTopic_Methods);
		Button subTopic_GettersSetters = createAccordionButton("Getters / Setters");
		methodsClassesLayout.addComponent(subTopic_GettersSetters);
		Button subTopic_Constructors = createAccordionButton("Constructors");
		methodsClassesLayout.addComponent(subTopic_Constructors);
		
		
		//Main Topic - Arrays
		Panel mainTopic_Arrays = new Panel();
		VerticalLayout arraysLayout = new VerticalLayout();
		mainTopic_Arrays.setContent(arraysLayout);
		accordion.addTab(mainTopic_Arrays, "Arrays");
		
		Button subTopic_ArrayArguments = createAccordionButton("Passing Arrays as Arguments");
		arraysLayout.addComponent(subTopic_ArrayArguments);
		Button subTopic_Arrays = createAccordionButton("Methods");
		arraysLayout.addComponent(subTopic_Arrays);
		Button subTopic_ClassArray = createAccordionButton("Class Array");
		arraysLayout.addComponent(subTopic_ClassArray);
		Button subTopic_ArrayList = createAccordionButton("ArrayList<E>");
		arraysLayout.addComponent(subTopic_ArrayList);
		
		return accordion;
	}

	private Button createAccordionButton(String text) 
	{
		Button button = new Button(text);
		button.setWidth("100%");
		
		return button;
	}
}