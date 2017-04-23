package JavaBasic.Module6;

public class ArrayTwoDimensional2 {//ArrayTwoDimensional - двомірний масив, в першому елементі масиву вкладені елементи іншого масиву

    public static void main(String[] args) {
        int[][] a = {//можна і так об'явити двомірний масив.
        {1,2,3},//a[0] - елемент двомірного вищого масиву
        {4,5,6},//a[1] - елемент двомірного вищого масиву
        {7,8,9}   };//a[2] - елемент двомірного вищого масиву

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();//якщо закоментувати числа виведуться в один рядок
        }

    }
}
