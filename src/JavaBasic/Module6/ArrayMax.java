package JavaBasic.Module6;

public class ArrayMax {
    public static void main(String[] args) {
        double array[] = {1.1, 2.2, 1.1, 3.2, 1.2, 2.1};
        double max = array[0];
        for (int i = 0; i < 6; i++) {
            if (max < array[i])
                max = array[i];
        }
        System.out.println("Максимальне число в масиві: " + max);
    }
}
