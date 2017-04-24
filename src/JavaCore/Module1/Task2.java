package JavaCore.Module1;

/*
Создать консольное приложение, которое просит пользователя ввести из консоли 5 чисел
Все числа должны быть записаны в массив целых чисел.

После этого, массив должен быть отсортирован по возрастанию и выведен консоль.
Сначала начальная версия, далее - отсортированная.

Пример:

Enter number 1:
5
Enter number 2:
4
Enter number 3:
3
Enter number 4:
2
Enter number 5:
1

Initial array: 5, 4, 3, 2, 1
Sorted array: 1, 2, 3, 4, 5.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {


    public static void main(String[] args) throws Exception {
        System.out.println("Введіть з консолі 5 чисел:");

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int[]list  = new int[5];

        for(int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        System.out.print("Initial array: ");
        for(int i : list)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        {
            System.out.print(i+", ");
        }

        for (int i = 0; i < list.length; i++) {
    /* Предполагаем, что начальный элемент рассматриваемого
     * фрагмента и будет минимальным.
     */
            int min = list[i]; // Предполагаемый минимальный элемент
            int imin = i; // Индекс минимального элемента
    /* Просматриваем оставшийся фрагмент массива и ищем там
     * элемент, меньший предположенного минимума.
     */
            for (int j = i+1; j < list.length; j++) {
        /* Если находим новый минимум, то запоминаем его индекс.
         * И обновляем значение минимума.
         */
                if (list[j] < min) {
                    min = list[j];
                    imin = j;
                }
            }
    /* Проверяем, нашёлся ли элемент меньше, чем стоит на
     * текущей позиции. Если нашёлся, то меняем элементы местами.
     */
            if (i != imin) {
                int temp = list[i];
                list[i] = list[imin];
                list[imin] = temp;
            }
        }
        {
            System.out.println();
            System.out.print("Sorted array: ");
        }
        for(int  imin: list)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        {
            System.out.print(imin+", ");
        }

    }}