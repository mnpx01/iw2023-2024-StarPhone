package com.application.views.main.registrologin;

import com.application.views.main.layouts.footer;
import com.application.views.main.layouts.header;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.login.LoginI18n;
import com.vaadin.flow.component.login.LoginOverlay;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@CssImport("./styles/styles.css")
@PageTitle("InicioDeSesión")
@Route(value = "/login")
public class login extends VerticalLayout {

    public login() {
        setWidthFull();
        setHeightFull();
        addClassName("mainView");
        setPadding(false);
        setSpacing(false);
        getStyle().set("font-family", "Kavoon");

        header h = new header();
        add(h);

        VerticalLayout centerDiv = new VerticalLayout();
        centerDiv.setWidthFull();
        centerDiv.setPadding(false);
        centerDiv.setSpacing(false);
        centerDiv.getStyle().set("gap", "140px");
        centerDiv.setAlignItems(Alignment.CENTER);

        add(centerDiv);
        expand(centerDiv);

        footer f = new footer();
        add(f);
    }
}