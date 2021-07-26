package com.github.dhirabayashi.designpattern.abstractfactory.factory;

import java.lang.reflect.InvocationTargetException;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        try {
            return (Factory) Class.forName(classname).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
