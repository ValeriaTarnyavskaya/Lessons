public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee() {
        this.fio = "Tarnyavskaya Valeria Andreevna";
        this.position = "PM";
        this.email = "leratarn@gmail.com";
        this.phone = "8545474";
        this.salary = 102482932;
        this.age = 27;
        infoEmployee();
    }

    void infoEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
    Employee [] person = new Employee[5];
    person [0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    person [1] = new Employee("Ivanov Sasha", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    person [2] = new Employee("Ivanov Kolya", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    person [3] = new Employee("Ivanov Misha", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    person [4] = new Employee("Ivanov Sergey", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
    }

    public Employee(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
}