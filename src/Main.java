import java.util.Scanner;
import java.util.TreeSet;

public class Main extends Indent {

    static String[] commands;
    static Scanner sc = new Scanner(System.in);
    static TreeSet<Lake> lakes = new TreeSet<Lake>();
    static String name;
    static String mainland;
    static double area;
    static String continueEntering;

    public static void main(String[] args) {
        System.out.println("Данные озёр");
        commands = new String[]{
                "Добавить",                   // 1
                "Вывести всё",                // 2
                "Выйти"                       // 3
        };
        int command;
        do {
            showCommands();
            System.out.print("Введите команду: ");
            command = sc.nextInt();
            sc.nextLine(); // этот вызов удаляет символ перевода строки
            runCommand(command);
        } while (true);
    }

    public static void showCommands() {
        System.out.println("Команды");
        int numberCommand;
        for (int i = 0; i < commands.length; i++) {
            numberCommand = i + 1;
            System.out.println(numberCommand + " - " + commands[i]);
        }
    }

    public static void runCommand(int command) {
        showEmptyParagraph();
        if (command == 1)
            requestLakes();
        else if (command == 2)
            showLakes();
        else if (command == 3)
            System.exit(0);
        else
            System.out.println("Такой команды нет. Повторите попытку\n");
    }

    public static void requestLakes() {
        System.out.println("Введите озёра:");
        do {
            requestLake();
            Lake lake = new Lake(name, mainland, area);
            lakes.add(lake);
            System.out.print("Продолжить ввод озёр? (y/n): ");
            continueEntering = sc.next();
            sc.nextLine();
            showEmptyParagraph();
        } while (continueEntering.equals("y"));
    }

    public static void requestLake() {
        System.out.print("Наименование: ");
        name = sc.nextLine();
        System.out.print("Материк: ");
        mainland = sc.nextLine();
        System.out.print("Площадь: ");
        area = sc.nextDouble();
        sc.nextLine();
    }


    public static void showLakes() {
        System.out.print("Озера");
        boolean isExist = false;
        int position = 1;
        for (Lake lake : lakes) {
            showEmptyParagraph();
            System.out.println(position + "\n" + lake);
            isExist = true;
            position++;
        }
        if (!isExist) {
            showEmptyParagraph();
            System.out.println("Пусто");
        }
        showEmptyParagraph();
    }
}
