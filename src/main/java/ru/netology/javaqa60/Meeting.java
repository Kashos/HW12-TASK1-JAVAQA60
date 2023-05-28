package ru.netology.javaqa60;

public class Meeting extends Task {

    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id); // вызов родительского конструктора
        this.topic = topic;
        this.project = project;
        this.start = start;// заполнение своих полей
    }

    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }

    boolean result;

    @Override
    public boolean matches(String query) {
        if (topic.contains(query)) {
            result = true;
            return result;
        }
        if (project.contains(query)) {
            result = true;
            return result;
        } else {
            result = false;
        }
        return result;
    }

    public boolean getMatches() {
        return result;
    }
}

