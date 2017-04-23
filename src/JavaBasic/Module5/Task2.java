package JavaBasic.Module5;

/*
 Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class Task2 {
    public static void main(String[] args) {

        //for (int i = 1; i<(55*2+1); i=i+2){
            //System.out.print(i+" ");
        int a = 1;
        for (int i = 1; i <= 55; i++) {
            System.out.print(a + " ");
            a=a+2;
        }
    }
}