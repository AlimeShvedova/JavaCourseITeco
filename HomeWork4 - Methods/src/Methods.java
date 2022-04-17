import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        test();
    }
    public static void test() {

        int nummin = 2;      // min цифр в числе
        int nummax = 5;      // max цифр в числе
        int lenghtline = 2;  // количество введенных элементов через пробел
        String sum;          // для вывода суммы словами
        String[] lineM;      // массив для первоначально введенной строки
        String[] lineN;      // массив для второго элемента lineM - числа
        int g = 5;

        do {
            do {
                System.out.println("Введите имя и число, содержащее от 2 до 5 цифр: ");
                Scanner scr = new Scanner(System.in);
                String line = scr.nextLine();
                lineM = line.split(" ");

            } while ((int) lineM.length != lenghtline);

            lineN = lineM[1].split("");

        } while (lineN.length < nummin | lineN.length > nummax);


        int[] linen = new int[lineN.length];   // массив с конвертированными элементами из строки в инт

        for (int j = 0; j < linen.length; j++) {
            linen[j] = Integer.parseInt(lineN[j]);
        }

        switch (sumf(0, linen)) {
            case 0:
                sum = "ноль";
                break;
            case 1:
                sum = "один";
                break;
            case 2:
                sum = "два";
                break;
            case 3:
                sum = "три";
                break;
            case 4:
                sum = "четыре";
                break;
            case 5:
                sum = "пять";
                break;
            case 6:
                sum = "шесть";
                break;
            case 7:
                sum = "семь";
                break;
            case 8:
                sum = "восемь";
                break;
            case 9:
                sum = "девять";
                break;
            case 10:
                sum = "десять";
                break;
            default:
                sum = "больше десяти";
        }

        System.out.println("Здравствуй, " + lineM[0] + "! Сумма цифр в числе = " + sum);
    }

    public static int sumf(int i, int[] linen) {
        if (i == (linen.length-1)) {
            return linen[i];
        }
        return linen[i]+sumf(i+1,linen);

    }
}
