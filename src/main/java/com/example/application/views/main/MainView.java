package com.example.application.views.main;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        VerticalLayout todosList = new VerticalLayout();
        TextField taskField = new TextField();
        Button addButton = new Button("Hinzufügen");
        addButton.addClickListener(click -> {
            Checkbox checkbox = new Checkbox(taskField.getValue());
            todosList.add(checkbox);
        });
        addButton.addClickShortcut(Key.ENTER);

        H1 mainTitle = new H1("Judith To-Do Liste");

        // Erstellen Sie das Image-Objekt für das Logo

        Image logoImage = new Image("file:///C:/Users/Judith/IdeaProjects/my-todo/Logo1.jpg", "Logoneu");
        logoImage.setWidth("100px");
        logoImage.setHeight("100px");
        logoImage.setAlt("Logo");

        // Erstellen Sie das HorizontalLayout und fügen Sie das H1-Element und das Image hinzu
        HorizontalLayout titleLayout = new HorizontalLayout(mainTitle, logoImage);
        titleLayout.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);

        // Fügen Sie das HorizontalLayout zur Hauptansicht hinzu
        add(titleLayout);

        add(todosList, taskField, addButton, logoImage);
    }
    }

