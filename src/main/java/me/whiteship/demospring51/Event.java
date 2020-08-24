package me.whiteship.demospring51;

public class Event {

    private String title;
    private Integer id;

    public Event(Integer id) {
        this.id = id;
    }

    public Event(String title, Integer id) {
        this.title = title;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", id=" + id +
                '}';
    }
}
