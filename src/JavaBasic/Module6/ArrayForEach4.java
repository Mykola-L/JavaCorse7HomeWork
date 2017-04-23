package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayForEach4 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        //int[] a = {1,2,3};//можливий також такий варіант запису.

        int [] b = a;//записуємо в масив b масив a
        b[0] = 100;//число 100 присвоюється масиву a і b. Масиви це об'єкти, це посилання

        a[1] = 38495;//число 38495 присвоюється масиву a і b. Масиви це об'єкти, це посилання

        System.out.println("Масив a");

        for(int i : a)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        { System.out.println(i);
        }

        System.out.println("Масив b");
        for(int i : b)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        { System.out.println(i);
        }
    }
}


