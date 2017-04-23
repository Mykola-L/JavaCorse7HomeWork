package JavaBasic.Module5;

/**
 * Created by andrey on 17.04.2017.
 */
public class For3 {

    public static void main(String[] args) {
        System.out.println("Перед циклом");

        //for (int i = 0, d=0; i<10; i++, d--){//можна об'явити кілька перемінних
        for (int i = 0, d=0; i<=10; i=i+2){//ще один варіант запису перемінної i
            System.out.println("qwe"+i +" d=" +d);
        }
        System.out.println("Після цикла");
    }
}