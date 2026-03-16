import java.util.Scanner;

public class Calculator {
    int x;
    char marker;
    Scanner sc = new Scanner(System.in);

    public int getInt() {
        while (true) {
            System.out.println("Введите число: ");

            if (sc.hasNextInt()) {
                x = sc.nextInt();
                break;
            } else {
                System.out.println("Число введено некорректно!");
                sc.nextLine();
            }
        }
        return x;
    }

    public char getOperation() {
        while (true) {
            System.out.println("Введите команду операции: (+, -, /, *)");
            marker = sc.next().charAt(0);
            if (marker == '+' || marker == '-' || marker == '*' || marker == '/') {
                if (marker == '/' && x == 0) {
                    System.out.println("Ошибка! на ноль делить нельзя.");
                    sc.nextLine();
                    continue;
                }
                break;
            } else {
                System.out.println("Ошибка! Такой команды не существует");
                sc.nextLine();
            }
        }
        return marker;
    }

    public void ending(int x1, int y2, char operation) {
        int result = 0;
        switch (operation) {
            case '+' -> result = x1 + y2;
            case '-' -> result = x1 - y2;
            case '*' -> result = x1 * y2;
            case '/' -> {
                if (x1 == 0 || y2 == 0) {
                    System.out.println("Ошибка ! Деление на ноль невозможно!");
                    break;
                } else {
                    result = x1 / y2;
                }
            }
        }
        System.out.println("Результат: " + result);
    }
}

