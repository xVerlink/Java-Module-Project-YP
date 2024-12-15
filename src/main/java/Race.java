import java.util.ArrayList;

class Race {
    private static Car leader;
    static final ArrayList<Car> CARS_LIST = new ArrayList<>();

    static void start() {
        int maxDistance = 0;
        for (Car car : CARS_LIST) {
            int distance = car.getSpeed() * 24;
            if (distance > maxDistance) {
                maxDistance = distance;
                leader = car;
            }
        }
        printWinner();
    }

    private static void printWinner() {
        System.out.println("Самая быстрая машина: " + leader.getName());
    }
}
