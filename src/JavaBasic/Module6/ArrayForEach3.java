package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayForEach3 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        //int[] a = {1,2,3};//можливий також такий варіант запису.

  int [] b = a;//записуємо в масив b масив a
        System.out.println("Масив a");

        for(int i : a)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        { System.out.println(i);
        }
        b[0] = 100;//число 100 присвоюється тільки масиву b
        System.out.println("Масив b");
        for(int i : b)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        { System.out.println(i);
        }
    }
}


