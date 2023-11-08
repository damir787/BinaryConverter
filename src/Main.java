import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: "); // вводим число которое хотим перевести
        String input = scanner.nextLine();
        System.out.println("Выберите тип данных: " + "1 - byte " + "2 - short, " + "3 - int " + "4 - long " + "5 - float " + "6 - double " ); // выбираем вариант ответа в диалоге
        int Type = scanner.nextInt();

        switch (Type) {
            case 1:
                byte byteResult = Byte.parseByte(input);
                System.out.println("byte: " + toBinary(byteResult));
                break;
            case 2:
                short shortResult = Short.parseShort(input);
                System.out.println("short: " + toBinary(shortResult));
                break;
            case 3:
                int intResult = Integer.parseInt(input);
                System.out.println("int: " + toBinary(intResult));
                break;
            case 4:
                long longResult = Long.parseLong(input);
                System.out.println("long: " + toBinary(longResult));
                break;
            case 5:
                float floatResult = Float.parseFloat(input);
                System.out.println("float: " + toBinary(floatResult));
                break;
            case 6:
                double doubleResult = Double.parseDouble(input);
                System.out.println("double: " + toBinary(doubleResult));
                break;
            default:
                System.out.println("Некорректный тип данных.");
                break;
        }
    }

    private static String toBinary(byte number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String toBinary(short number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 15; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String toBinary(long number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 63; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }

    private static String toBinary(float number) {
        return toBinary(Float.floatToIntBits(number));
    }

    private static String toBinary(double number) {
        return toBinary(Double.doubleToLongBits(number));
    }
}
