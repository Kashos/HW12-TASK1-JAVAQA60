package ru.netology.javaqa60;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void shouldFindMatchesInSimpleTask() {

        simpleTask.matches("Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchesInSimpleTask() {

        simpleTask.matches("Слова");

        boolean expected = false;
        boolean actual = simpleTask.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchesInEpic() {

        epic.matches("Яйца");

        boolean expected = true;
        boolean actual = epic.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchesInEpic() {

        epic.matches("Слова");

        boolean expected = false;
        boolean actual = epic.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchesInMeetingProject() {

        meeting.matches("Приложение НетоБанка");

        boolean expected = true;
        boolean actual = meeting.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMatchesInMeetingTopic() {

        meeting.matches("Выкатка 3й версии приложения");

        boolean expected = true;
        boolean actual = meeting.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindMatchesInMeeting() {

        meeting.matches("Слова");

        boolean expected = false;
        boolean actual = meeting.getMatches();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetIdSimpleTask() {

        int expected = 5;
        int actual = simpleTask.getId();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetTitle() {

        String expected = "Позвонить родителям";
        String actual = simpleTask.getTitle();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSubtasks() {

        String[] expected = {"Молоко", "Яйца", "Хлеб"};
        String[] actual = epic.getSubtasks();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetTopic() {

        String expected = "Выкатка 3й версии приложения";
        String actual = meeting.getTopic();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetProject() {

        String expected = "Приложение НетоБанка";
        String actual = meeting.getProject();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldGetStart() {

        String expected = "Во вторник после обеда";
        String actual = meeting.getStart();

        Assertions.assertEquals(expected, actual);
    }
}
