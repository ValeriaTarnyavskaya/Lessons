import java.time.LocalDateTime;

public class Park {
    int numberOfAttractions;
    Attraction[] attractions;

    public Park(int numberOfAttractions) {
        this.numberOfAttractions = numberOfAttractions;
        this.attractions = new Attraction[numberOfAttractions];
    }

    public void addAttraction(Attraction attraction) {
        if (numberOfAttractions > 0) {
            attractions[numberOfAttractions-1] = attraction;
            numberOfAttractions--;
            System.out.println("Добавлен атракцион");
        } else {
            System.out.println("Нет мест");
        }

    }
    public void showInfo () {
        for (int i = 0; i < attractions.length; i++) {
            System.out.println(attractions[i]);
        };
    }

    static class Attraction {
        String name;
        LocalDateTime timeWork;
        int cost;

        public Attraction(String name, LocalDateTime timeWork, int cost) {
            this.name = name;
            this.timeWork = timeWork;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", timeWork=" + timeWork +
                    ", cost=" + cost +
                    '}';
        }
    }
}