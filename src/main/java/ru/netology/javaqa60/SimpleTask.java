package ru.netology.javaqa60;

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    boolean result;

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean getMatches() {
        return result;
    }
}
