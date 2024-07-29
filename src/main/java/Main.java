import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee[] person = new Employee[5];
        person[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        person[1] = new Employee("Ivanov Sasha", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        person[2] = new Employee("Ivanov Kolya", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        person[3] = new Employee("Ivanov Misha", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        person[4] = new Employee("Ivanov Sergey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        for (int i = 0; i < person.length - 1; i++) {
            System.out.println(person[i].toString());
        }
        Park park= new Park(2);
        park.addAttraction(new Park.Attraction("GomelPark", LocalDateTime.now(), 200));
        park.addAttraction(new Park.Attraction("GrodnoPark", LocalDateTime.now(), 100));
        park.addAttraction(new Park.Attraction("MinskPark", LocalDateTime.now(), 300));
        park.showInfo();
    }


}
