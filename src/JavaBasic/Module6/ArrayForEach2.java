package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayForEach2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,65,2435,6776};
        //int[] a = {1,2,3,65,2435,6776};//можливий також такий варіант запису.

       //for(int i = 0; i < a.length; i++){
            //System.out.println(a[i]);
        for(int i : a)//пробігаємося по масиву. кожен елемент масиву присвоюємо перемінній і.
        { System.out.println(i);
        }
    }
}


