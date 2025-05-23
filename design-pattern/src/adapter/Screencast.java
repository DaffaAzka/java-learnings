package adapter;

public class Screencast {
    String title;
    String author;
    Long duration;

    public Screencast(String title, String author, Long duration) {
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Screencast{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", duration=" + duration +
                '}';
    }
}
