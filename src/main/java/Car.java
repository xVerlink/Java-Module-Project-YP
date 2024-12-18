class Car {
    private String name;
    private int speed;
    final static int MIN_SPEED = 0;
    final static int MAX_SPEED = 250;

    Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
