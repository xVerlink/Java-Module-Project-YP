

class Race {
    private static Car leader = new Car("", 0);
    private static int maxDistance = 0;

    static void setLeader(String name, int speed) {
        int distance = speed * 24;
        if (distance > maxDistance) {
            maxDistance = distance;
            leader.setName(name);
            leader.setSpeed(speed);
        }
    }

    static void printWinner() {
        System.out.println("Самая быстрая машина: " + leader.getName());
    }
}
