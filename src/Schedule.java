import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Schedule {
    private List<Event> events;

    // Конструктор
    public Schedule() {
        this.events = new ArrayList<>();
    }

    // Додавання заходу
    public void addEvent(Event event) {
        events.add(event);
    }

    // Отримання заходів на певну дату
    public List<Event> getEventsByDate(LocalDate date) {
        return events.stream()
                .filter(event -> event.getDateTime().toLocalDate().equals(date))
                .collect(Collectors.toList());
    }

    // Видалення заходів із датою, меншою за поточну
    public void removePastEvents() {
        LocalDateTime now = LocalDateTime.now();
        events.removeIf(event -> event.getDateTime().isBefore(now));
    }

    // Виведення всіх заходів
    public void printAllEvents() {
        if (events.isEmpty()) {
            System.out.println("Розклад порожній.");
        } else {
            events.forEach(System.out::println);
        }
    }
}
