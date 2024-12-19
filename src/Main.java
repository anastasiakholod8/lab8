import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Створення розкладу
        Schedule schedule = new Schedule();

        // Додавання заходів
        schedule.addEvent(new Event("Конференція з технологій", LocalDateTime.of(2024, 12, 15, 10, 0), "Київ, БЦ"));
        schedule.addEvent(new Event("Зустріч команди", LocalDateTime.of(2024, 12, 16, 14, 0), "Zoom"));
        schedule.addEvent(new Event("Спортивний захід", LocalDateTime.of(2024, 12, 14, 16, 0), "Стадіон"));
        schedule.addEvent(new Event("Минуле тренування", LocalDateTime.of(2024, 12, 10, 18, 0), "Зал"));

        // Виведення всіх заходів
        System.out.println("Усі заходи:");
        schedule.printAllEvents();

        // Фільтрація заходів за певною датою
        System.out.println("\nЗаходи на 14.12.2024:");
        LocalDate filterDate = LocalDate.of(2024, 12, 14);
        schedule.getEventsByDate(filterDate).forEach(System.out::println);

        // Видалення минулих заходів
        schedule.removePastEvents();
        System.out.println("\nПісля видалення минулих заходів:");
        schedule.printAllEvents();
    }
}

