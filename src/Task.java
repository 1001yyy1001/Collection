import java.time.LocalDate;

public class Task implements Comparable<Task> {
    private LocalDate date;
    private String description;

    public Task(LocalDate date, String description) {
        this.date = date;
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task other) {
        return this.date.compareTo(other.date);
    }

    @Override
    public String toString() {
        return date + " " + description;
    }
}
