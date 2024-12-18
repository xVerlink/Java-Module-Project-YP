import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.printf("Введите название машины №%d:%n", i);
            String name = scanner.nextLine();
            int speed;

            while (true) {
                System.out.printf("Введите скорость машины №%d:%n", i);
                Scanner speedScanner = new Scanner(System.in);
                if (speedScanner.hasNextInt()) {
                    speed = speedScanner.nextInt();
                    if (speed > Car.MIN_SPEED && speed <= Car.MAX_SPEED) {
                        break;
                    } else {
                        System.out.println("Неправильная скорость");
                    }
                } else {
                    System.out.println("Введенная строка не является числом");
                }
            }
            Race.setLeader(name, speed);
        }
        scanner.close();
        Race.printWinner();
    }
}
