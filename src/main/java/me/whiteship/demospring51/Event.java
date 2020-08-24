package me.whiteship.demospring51;

public class Event {

    Integer id;

    String title;

    public Event(int id){
        this.id = id;
    }

    public Event(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Event{" + "id=" + id + ", title='" + title + '\'' + '}';
    }
}
