import java.util.Random;                    // імпортуємо клас Random

public class RandomArray {
    public static void main(String[] args) {
        int m = 5, n = 4;                        //оголошуємо і ініцілізуємо змінні з розмірами масиву
        int Array[][] = new int[m][n];    //оголошуємо і ініціалізуємо масив
        Random generator = new Random();    // створюємо генератор випадкович чисел
        int gn;                 //змінна в яку буде записуватися згенероване генератором число

        /* заповнюємо масив випадковими числами */
        for (int i = 0; i < m; i++)             //проходимось по стовпцях
            for (int j = 0; j < n; j++) {        //проходимось по рядках
                gn = generator.nextInt(100);  //генерація випадкового числа від 0 до 100;
                Array[i][j] = gn;             //записуємо згенероване випадкове число
            }

        /* Виводимо результат */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)         // зверніть увагу на відсутність фігурної дужки
                System.out.print(Array[i][j] + "    ");//даний рядок відноситься до масиву по j
            System.out.println();          //виводимо символи переводу каретки і нового рядка
            //після кожного проходження стовпцевих елементів рядка
        }
    }
}
