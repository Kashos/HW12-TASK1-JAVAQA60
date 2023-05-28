package ru.netology.javaqa60;

public class Epic extends Task {

    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id); // вызов родительского конструктора
        this.subtasks = subtasks; // заполнение своих полей
    }

    public String[] getSubtasks() {
        return subtasks;
    }

    boolean result;

    @Override
    public boolean matches(String query) {
        for (int i = 0; i < subtasks.length; i++) {
            if (subtasks[i].contains(query)) {
                result = true;
                return result;
            } else {
                result = false;
            }
        }
        return result;
    }

    public boolean getMatches() {
        return result;
    }
}
