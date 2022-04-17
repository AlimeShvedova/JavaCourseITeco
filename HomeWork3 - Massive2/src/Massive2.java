import java.util.Scanner;

public class Massive2 {
    public static void main(String[] args) {
        /*Scanner scr = new Scanner(System.in);
        Scanner scr2 = new Scanner(System.in);

        System.out.print("Введите количество строк массива: ");
        int line = scr.nextInt();
        System.out.print("Введите количество столбцов массива: ");
        int col = scr2.nextInt();
         */

        int line = 4, col = 3;
        int[][] massive = new int[line][col];


        // int[][] massive = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};


        for (int i = 0; i < line; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Введите " + i + j + " элемент массива: ");
                Scanner scr3 = new Scanner(System.in);
                massive[i][j] = scr3.nextInt();
            }

        }
        System.out.print("\n");  //для красоты вывода


/*      // вывести массив через for, посмотреть, что он верный
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
*/

        // Задание 1
        int sum = 0;

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                sum += massive[i][j];
            }
            System.out.println("Line " + (i + 1) + ": " + sum);
            sum = 0;
        }
        System.out.print("\n");  //для красоты вывода


        // Задание 2
        int sum2 = 0;

        for (int j = 0; j < col; j++) {
            for (int i = 0; i < line; i++) {
                sum2 += massive[i][j];
            }
            System.out.println("Coloumn " + (j + 1) + ": " + sum2);
            sum2 = 0;
        }
        System.out.print("\n");  //для красоты вывода


        // Задание 4
        int summa = 0;
        int avg = 0;

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                summa += massive[i][j];
            }
            avg = (summa / col);
            System.out.println(avg);
            summa = 0;
        }
        System.out.print("\n");  //для красоты вывода


        // Задание 5
        int[] mass1 = new int[line * col];
        int k = 0;

        for (int i = (massive.length - 1); i >= 0; i--) {
            for (int j = (massive[i].length - 1); j >= 0; j--) {
                mass1[k] = massive[i][j];
                k++;
            }
        }

        for (int g : mass1) {
            System.out.print(g + " ");
        }
        System.out.print("\n");  //для красоты вывода
        System.out.print("\n");  //для красоты вывода


        // Задание 3
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                if ((massive[i][j] % 2) == 0) {
                    massive[i][j] = 0;
                } else {
                    massive[i][j] = 1;
                }
            }
        }
        for (int[] m : massive) {
            for (int l : m) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
