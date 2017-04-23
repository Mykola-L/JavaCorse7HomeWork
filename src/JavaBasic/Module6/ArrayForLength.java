package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayForLength {
    public static void main(String[] args) {
        int[] a = new int[10];

        for(int i = 0; i < a.length; i++){
            a[i] = i;
            System.out.println(a[i]);
        }
    }
}
