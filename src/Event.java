import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private LocalDateTime dateTime;
    private String location;

    // Конструктор
    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }

    // Метод toString для текстового представлення заходу
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Захід: [" + name + "], Дата: [" + dateTime.format(formatter) + "], Місце: [" + location + "]";
    }

    // Гетери
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}

