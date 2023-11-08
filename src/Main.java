import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: "); // вводим число которое хотим перевести
        String input = scanner.nextLine();
        System.out.println("Выберите тип данных: " + "1 - byte " + "2 - short, " + "3 - int " + "4 - long " + "5 - float " + "6 - double " ); // выбираем вариант ответа в диалоге
        int Type = scanner.nextInt();

        switch (Type) {
            case 1:// преобразуем строку байт в число
                byte byteResult = Byte.parseByte(input);
                System.out.println("byte: " + toBinary(byteResult));
                break;
            case 2:// преобразуем строку short в число 
                short shortResult = Short.parseShort(input);
                System.out.println("short: " + toBinary(shortResult));
                break;
            case 3:// преобразуем строку int в число
                int intResult = Integer.parseInt(input);
                System.out.println("int: " + toBinary(intResult));
                break;
            case 4:// преобразуем строку long в число
                long longResult = Long.parseLong(input);
                System.out.println("long: " + toBinary(longResult));
                break;
            case 5:// преобразуем строку float в число
                float floatResult = Float.parseFloat(input);
                System.out.println("float: " + toBinary(floatResult));
                break;
            case 6:// преобразуем строку float в число
                double doubleResult = Double.parseDouble(input);
                System.out.println("double: " + toBinary(doubleResult));
                break;
               
        }
    }
 // переводим число типа byte в двоичную систему счисления
    private static String toBinary(byte number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 7; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }
// переводим число типа short в двоичную систему счисления
    private static String toBinary(short number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 15; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }
 // переводим число типа int в двоичную систему счисления
    private static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }
    // переводим число типа long в двоичную систему счисления
    private static String toBinary(long number) {
        StringBuilder binary = new StringBuilder();
        for (int i = 63; i >= 0; i--) {
            binary.append((number >> i) & 1);
        }
        return binary.toString();
    }
    // переводим число типа float в двоичную систему счисления
    private static String toBinary(float number) {
        return toBinary(Float.floatToIntBits(number));
    }
    // переводим число типа double в двоичную систему счисления
    private static String toBinary(double number) {
        return toBinary(Double.doubleToLongBits(number));
    }
}
