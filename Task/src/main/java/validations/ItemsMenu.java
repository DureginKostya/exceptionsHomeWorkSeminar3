package validations;

import java.util.Scanner;

public class ItemsMenu {
    public int checkingItemMenu() {
        Scanner sc = new Scanner(System.in);
        String line;
        System.out.println();
        printHint();
        System.out.print("Введите пункт меню: ");
        try {
            line = sc.next();
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Введено неправильное значение, повторите ввод");
            return checkingItemMenu();
        }
    }
    private void printHint() {
        String msg = new StringBuilder()
                .append("Меню:\n")
                .append("* Добавить запись - << 1 >>\n")
                .append("* Просмотреть запись  - << 2 >>\n")
                .append("* Выйти - << 0 >>")
                .toString();
        System.out.println(msg);
    }
}
