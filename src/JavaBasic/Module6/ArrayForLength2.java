package JavaBasic.Module6;

public class ArrayForLength2 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,65,2435,6776};
        //int[] a = {1,2,3,65,2435,6776};//можливий також такий варіант запису.

        for(int i = 0; i < a.length; i++){

            System.out.println(a[i]);
        }
    }
}
