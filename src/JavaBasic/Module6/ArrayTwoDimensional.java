package JavaBasic.Module6;

/**
 * Created by andrey on 17.04.2017.
 */
public class ArrayTwoDimensional {//ArrayTwoDimensional - двомірний масив

    public static void main(String[] args) {
        int[][] a = new int [3][];//двомірний масив
        //int[][][] a = new int [3][][];//тримірний масив
        //int[][][][] a = new int [3][][][];//чотиримірний масив. Масиви бувають багатомірні, обмеження немає.

        int[] i4 = {1,2,3};
        int[] i1 = {4,5,6};
        int[] i2 = {7,8,9};

        a[0] = i4;
        a[1] = i1;
        a[2] = i2;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j]);
            }
           System.out.println();//якщо закоментувати числа виведуться в один рядок
        }

    }
}
