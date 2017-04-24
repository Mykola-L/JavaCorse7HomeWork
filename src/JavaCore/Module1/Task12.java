package JavaCore.Module1;

/*
 Консольное приложение:
 - ввод размера массива int
 - ввод элементов массива

 - меню с возможными операциями над ним:
 - поиск чила по значению
 - сортировка

 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task12 {


    public static void main(String[] args) throws Exception {
        System.out.println("Введіть з консолі розмір масиву:");

        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int[]list  = new int[n];

        System.out.println("Введіть елементи масива:");
        for(int i = 0; i < list.length; i++)
        {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
        System.out.print("Initial array(Початковий масив): ");
        for(int i : list)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        {
            System.out.print(i+", ");
        }
        {
            System.out.println("Введіть: 1 для сортування масиву по зростанню. Введіть: 2 для пошуку числа по значенню. Для виводу елемента масиву введіть 3.");
        }
        int n1 = Integer.parseInt(reader.readLine());
        if(n1==1) {
            for (int i = 0; i < list.length; i++) {
    /* Предполагаем, что начальный элемент рассматриваемого
     * фрагмента и будет минимальным.
     */
                int min = list[i]; // Предполагаемый минимальный элемент
                int imin = i; // Индекс минимального элемента
    /* Просматриваем оставшийся фрагмент массива и ищем там
     * элемент, меньший предположенного минимума.
     */
                for (int j = i + 1; j < list.length; j++) {
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
                System.out.print("Sorted array(Відсортований масив): ");
            }
            for (int imin : list)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
            {
                System.out.print(imin + ", ");
            }
        }
        else if(n1==2)
        { {System.out.println("Пошук числа по значенню. Введіть число:");}
        int n2 = Integer.parseInt(reader.readLine());
            for(int i = 0; i<n; i++) //умова
            if (n2==list[i])
            {n2=list[i];
            System.out.println("Знайдене число: "+n2);}
            }


        else if(n1==3) {
            System.out.println("Введіть елемент масива:");
            int n3 = Integer.parseInt(reader.readLine());
            int a3 = list[n3];
            System.out.println("Елемент масиву: [" + n3 +"] = " + a3);
        }
    }}