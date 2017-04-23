package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class Array {
    public static void main(String[] args) {
        int[]a = new int[10];//об'явив масив з 10 елементів

        a[0] = 100;
        a[1] = 200;
        a[2] = 300;

        int a1 = a[0];
        int a2 = a[1];
        int a3 = a[2];

        //System.out.println(a[0]);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
