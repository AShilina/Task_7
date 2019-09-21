import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();

        class Constants {
            static final int X = 8;
            static final int Y = 17;
            static final int Z = 666;
        }

        if (number == Constants.X || number == Constants.Y || number == Constants.Z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}