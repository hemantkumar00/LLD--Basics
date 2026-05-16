package com.advanceJava.abstractFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
    public void renderUI(){
        button.paint();
        checkbox.check();
    }
}
