public class Massive1 {
    public static void main(String[] args) {
        int[] massive = {3, 22, 1, 13, 4, 6, 16, 5};

        //1. через пробел четные
        System.out.println("1. Чётные числа через пробел");
        for (int i = 0; i < massive.length; i++)
            if ((massive[i] % 2) == 0)
                System.out.print(massive[i] + " ");
        System.out.println();


        //2. двузначные
        System.out.println("2. Двузначные числа");
        for (int i = 0; i < massive.length; i++)
            if (massive[i] > 9 && massive[i] < 100)
                System.out.println(massive[i]);


        //3. наибольшее число массива
        System.out.println("3. Наибольшее число");
        int max = massive[0];
        for (int i = 1; i < massive.length; i++)
            if (massive[i] > max)
                max = massive[i];
        System.out.println(max);


        //4. сумму элементов массива
        System.out.println("4. Сумма элементов");
        int sum = 0;
        for (int i = 0; i < massive.length; i++)
            sum += massive[i];
        System.out.println(sum);


        //5. * переворачивает массив в обратном порядке
        System.out.println("5. Перевернуть массив");
        int j = 0;
        for (int i = 0; i < (massive.length/2); i++) {
            j = massive[i];
            massive[i] = massive[massive.length - 1 - i];
            massive[massive.length - 1 - i] = j;
        }
        for (int i: massive) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
