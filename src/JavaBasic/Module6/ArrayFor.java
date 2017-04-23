package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayFor {
    public static void main(String[] args) {
        int[] a = new int[100];

        for(int i = 0; i < 100; i++){
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}